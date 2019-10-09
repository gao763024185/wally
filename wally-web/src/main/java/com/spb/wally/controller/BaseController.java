package com.spb.wally.controller;

import com.spb.wally.domain.entity.BaseMenuDO;
import com.spb.wally.service.BaseMenuService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description 基础控制器
 * @author: gaobh
 * @date: 2019/10/09 15:30
 * @version: v1.0
 */
@RestController
public class BaseController {
    @Resource
    private BaseMenuService baseMenuService;

    /**
     * 菜单列表
     *
     * @param modelMap
     * @return
     */
    public ModelMap getMenuList(ModelMap modelMap) {
        List<BaseMenuDO> list = baseMenuService.findAll();
        modelMap.addAttribute("menuList", list);
        return modelMap;
    }
}
