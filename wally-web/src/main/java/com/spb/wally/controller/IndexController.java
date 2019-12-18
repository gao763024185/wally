package com.spb.wally.controller;

import com.spb.wally.domain.bo.LogsBO;
import com.spb.wally.domain.entity.BaseMenuDO;
import com.spb.wally.domain.entity.BaseUserDO;
import com.spb.wally.domain.query.LogsQuery;
import com.spb.wally.mapper.LogsMapper;
import com.spb.wally.service.BaseMenuService;
import com.spb.wally.service.LogsService;
import com.spb.wally.service.UserInfoService;
import com.spb.wally.utils.Pager;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description 首页相关控制器
 * @author: gaobh
 * @date: 2019/1/30 16:30
 * @version: v1.0
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    private UserInfoService userInfoService;
    @Resource
    private LogsService logsService;
    @Resource
    private LogsMapper logsMapper;
    @Resource
    private BaseMenuService baseMenuService;

    /**
     * 网站首页
     * 利用sublist进行分页
     *
     * @param modelMap
     * @param pageNum
     * @return
     */
    @RequestMapping("index1")
    public ModelAndView showTest1(Model modelMap, @RequestParam(value = "pageNum", required = false) Integer pageNum) {
        if (pageNum == null) {
            pageNum = 1;
        }
        int pageSize = 5;
        List<LogsBO> logsList = logsService.getLogsByQuery(null);
        //最新笔记
        Pager<LogsBO> pager = new Pager<>(1, 8, logsList);
        modelMap.addAttribute("logs", pager);
        modelMap.addAttribute("logsCount", pager.getDataList().size());
        //分页显示的笔记
        Pager<LogsBO> pager1 = new Pager<>(pageNum, pageSize, logsList);
        modelMap.addAttribute("logs1", pager1);
        modelMap.addAttribute("pageNum", pageNum);
        List<BaseMenuDO> list = baseMenuService.findAll();
        modelMap.addAttribute("menuList", list);
        List<BaseUserDO> user = userInfoService.findAll();
        modelMap.addAttribute("user", user.get(0));
        return new ModelAndView("/index", "indexModel2", modelMap);
    }


    /**
     * 网站首页
     * 利用mysql的limit进行分页
     *
     * @param modelMap
     * @param pageNum
     * @return
     */
    @RequestMapping("index")
    public ModelAndView showTest(Model modelMap, @RequestParam(value = "pageNum", required = false) Integer pageNum, Integer pageSize) {
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        modelMap.addAttribute("pageNum", pageNum);
        LogsQuery query = new LogsQuery();
        //最新笔记
        query.setOffset(0);
        query.setPageSize(8);
        List<LogsBO> noteLogsList = logsService.getLogsByQuery(query);
        modelMap.addAttribute("noteLogs", noteLogsList);
        //分页显示的笔记
        Pager<LogsBO> pager1;
        int count = logsMapper.logsCount(query);
        if (count == 0) {
            pager1 = new Pager<>(pageNum, pageSize, count, null);
        } else {
            query.setOffset(pageSize * (pageNum - 1));
            query.setPageSize(pageSize);
            List<LogsBO> logsList = logsService.getLogsByQuery(query);
            pager1 = new Pager<>(pageNum, pageSize, count, logsList);
        }
        modelMap.addAttribute("logsPageList", pager1);
        List<BaseMenuDO> list = baseMenuService.findAll();
        modelMap.addAttribute("menuList", list);
        List<BaseUserDO> user = userInfoService.findAll();
        modelMap.addAttribute("user", user.get(0));
        return new ModelAndView("/index", "indexModel", modelMap);
    }
}
