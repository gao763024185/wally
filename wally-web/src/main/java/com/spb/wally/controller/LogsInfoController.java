package com.spb.wally.controller;

import com.spb.wally.domain.bo.LogsBO;
import com.spb.wally.domain.entity.BaseMenuDO;
import com.spb.wally.domain.entity.LogsDO;
import com.spb.wally.service.BaseMenuService;
import com.spb.wally.service.LogsService;
import com.spb.wally.tools.LogCount;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
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
public class LogsInfoController extends BaseController{

    @Resource
    private LogsService logsService;
    @Resource
    ServletContext context;

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
        super.getMenuList(modelMap);
        LogsDO logs = logsService.getById(logId);
        modelMap.addAttribute("logs", logs);
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
        super.getMenuList(modelMap);
        List<LogsBO> logsList = logsService.getLogsByQuery(null);
        modelMap.addAttribute("logsList", logsList);
        List<Map<String, String>> listContext = (List) context.getAttribute("list");
        for (int i = 0; listContext != null && i < listContext.size(); i++) {
            for (LogsBO logs : logsList) {
                if (logs.getId().equals(listContext.get(i).get("logId"))) {
                    logs.setCount(Integer.valueOf(listContext.get(i).get("count")));
                }
            }
        }
        return new ModelAndView("/documents", "indexModel", modelMap);
    }

    /**
     * 进入about页面
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("/about")
    public ModelAndView about(ModelMap modelMap) {
        super.getMenuList(modelMap);
        return new ModelAndView("/about", "indexModel", modelMap);
    }
}
