package com.spb.wally.controller;

import com.spb.wally.domain.entity.BaseMenuDO;
import com.spb.wally.domain.entity.LogsDO;
import com.spb.wally.service.BaseMenuService;
import com.spb.wally.service.LogsService;
import org.springframework.ui.ModelMap;
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
public class LogsInfoController {

    @Resource
    private LogsService logsService;
    @Resource
    private BaseMenuService baseMenuService;

    /**
     * 日志详情页
     *
     * @param modelMap
     * @param logId
     * @return
     */
    @RequestMapping("/detail")
    public ModelAndView detail(ModelMap modelMap, @RequestParam(value = "logId") String logId) {
        LogsDO logs = logsService.getById(logId);
        modelMap.addAttribute("logs", logs);
        List<BaseMenuDO> list = baseMenuService.findAll();
        modelMap.addAttribute("menuList", list);
        return new ModelAndView("/detail", "indexModel", modelMap);
    }
}