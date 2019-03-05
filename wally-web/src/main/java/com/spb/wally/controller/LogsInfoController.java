package com.spb.wally.controller;

import com.spb.wally.domain.bo.LogsBO;
import com.spb.wally.domain.entity.BaseMenuDO;
import com.spb.wally.domain.entity.LogsDO;
import com.spb.wally.service.BaseMenuService;
import com.spb.wally.service.LogsService;
import com.spb.wally.utils.LogCount;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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
    ServletContext context;
    @Resource
    private BaseMenuService baseMenuService;

    /**
     * 日志详情页
     *
     * @param modelMap
     * @param logId
     * @return
     */
    @LogCount
    @RequestMapping("/detail")
    public ModelAndView detail(ModelMap modelMap, @RequestParam(value = "logId") String logId) {
        LogsDO logs = logsService.getById(logId);
        modelMap.addAttribute("logs", logs);
        List<BaseMenuDO> list = baseMenuService.findAll();
        modelMap.addAttribute("menuList", list);
        return new ModelAndView("/detail", "indexModel", modelMap);
    }

    /**
     * 进入归档页面
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("/documents")
    public ModelAndView documents(ModelMap modelMap) {
        List<LogsBO> logsList = logsService.getLogsByQuery(null);
        modelMap.addAttribute("logsList", logsList);
        List<Map<String, String>> listContext = (List) context.getAttribute("list");
        List<BaseMenuDO> list = baseMenuService.findAll();
        for (int i = 0; listContext != null && i < listContext.size(); i++) {
            for (LogsBO logs : logsList) {
                if (logs.getId().equals(listContext.get(i).get("logId"))) {
                    logs.setCount(Integer.valueOf(listContext.get(i).get("count")));
                }
            }
        }
        modelMap.addAttribute("menuList", list);
        return new ModelAndView("/documents","indexModel",modelMap);
    }

}
