package com.spb.wally.controller;

import com.spb.wally.domain.bo.LogsBO;
import com.spb.wally.domain.entity.BaseUserDO;
import com.spb.wally.domain.entity.LogsDO;
import com.spb.wally.service.LogsService;
import com.spb.wally.service.UserInfoService;
import com.spb.wally.tools.JsonResp;
import com.spb.wally.utils.Pager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description 后台controller
 * @author: gaobh
 * @date: 2016/12/16
 * @version: v1.0
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {
    private final static Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Resource
    private UserInfoService userInfoService;

    @Resource
    private LogsService logsService;
    String view_base = "admin/";

    /**
     * 后台登录页
     *
     * @param model
     * @param uid
     * @return
     */
    @RequestMapping("/")
    public ModelAndView loginPage(ModelMap model, @CookieValue(value = "uid", required = false) String uid) {
        uid = "1";
        if (uid == null) {
            return new ModelAndView(view_base + "login", "indexModel", model);
        } else {
            String returnUrl = "crainnogao_ad";
            int flag = 1;
            return crainnogao_ad(model, null, 1, flag, returnUrl, uid, null);
        }


    }

    /**
     * 登陆验证
     *
     * @param user
     * @param codeText
     * @param response
     * @param request
     * @return
     */
    @RequestMapping(value = "/loginVal", method = RequestMethod.POST)
    @ResponseBody
    public Object loginVal(BaseUserDO user, @RequestParam(value = "codeText", required = false) String codeText,
                           HttpServletResponse response, HttpServletRequest request) {

        HttpSession session = request.getSession();
        String validateCode = session.getAttribute("validateCode").toString();
        if (validateCode == null || validateCode == "") {
            return new JsonResp(JsonResp.Result_Fail, null, "验证码信息过期,请重新刷新输入", null);
        }
        if (!(codeText.equalsIgnoreCase(validateCode))) {
            return new JsonResp(JsonResp.Result_Fail, null, "验证码输入错误", null);
        }
        BaseUserDO baseUser = userInfoService.loginValid(user);
        if (baseUser == null) {
            return new JsonResp(JsonResp.Result_Fail, null, "用户名或密码输入错误", null);
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("uid", String.valueOf(baseUser.getId()));
        map.put("userName", baseUser.getUserName());
        //写入cookie
//        UserAgent userAgent = new UserAgent();
//        userAgent.setUid(String.valueOf(baseUser.getUid()));
//        userAgent.setUserName(baseUser.getUserName());
//        userAgent.setPassword(baseUser.getPassword());
        // Cookie

        Cookie cookieUid = new Cookie("uid", String.valueOf(baseUser.getId()));
        cookieUid.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieUid);

        Cookie cookieUserName = new Cookie("userName", baseUser.getUserName());
        cookieUserName.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieUserName);

        Cookie cookiePsw = new Cookie("password", baseUser.getPassword());
        cookiePsw.setMaxAge(24 * 60 * 60);
        response.addCookie(cookiePsw);

        return new JsonResp(JsonResp.Result_Success, null, null, map);
    }

    /**
     * 后台主界面
     *
     * @param model
     * @param logs1
     * @param pageNum
     * @param flag
     * @param returnUrl
     * @param uid
     * @param item
     * @return
     */
    @RequestMapping("/crainnogao_ad")
    public ModelAndView crainnogao_ad(ModelMap model, LogsDO logs1, @RequestParam(value = "pageNum", required = false) Integer pageNum,
                                      @RequestParam(value = "flag", required = false) Integer flag,
                                      @RequestParam(value = "returnUrl", required = false) String returnUrl,
                                      @CookieValue(value = "uid", required = false) String uid,
                                      @RequestParam(value = "item", required = false) String item) {

        if (uid == null) {
            return new ModelAndView(view_base + "login", "indexModel", model);
        }
        super.getMenuList(model);
        //编辑dairy
        if (logs1 != null) {
            LogsDO logDairy = logsService.getById(logs1.getId());
            model.addAttribute("logDairy", logDairy);
        }
        if (pageNum == null) {
            pageNum = 1;
        }
        int pageSize = 10;
        //用户信息显示
        List<BaseUserDO> user = userInfoService.findAll();
        model.addAttribute("list", user);
        model.addAttribute("userAvatar", user.get(0).getAvatarThumbnail());
        //logs信息显示
        List<LogsBO> logs = logsService.getLogsByQuery(null);
        Pager<LogsBO> logsPager = new Pager<LogsBO>(pageNum, pageSize, logs);
        model.addAttribute("listlogs", logsPager);
        model.addAttribute("item", item);
        model.addAttribute("pageNum", pageNum);
        //筛选
        if (flag != null && flag == 1) {
            return new ModelAndView("redirect:" + returnUrl, "indexModel", model);
        } else {
            return new ModelAndView(view_base + "crainnogao_ad", "indexModel", model);
        }
    }

//    /**
//     * 用户信息编辑
//     *
//     * @param modelMap
//     * @param id
//     * @return
//     */
//    @RequestMapping("/userEdit")
//    public String userEdit(ModelMap modelMap, @RequestParam(value = "id", required = false) Integer id) {
//
//        modelMap.addAttribute("id", id);
//        BaseUser user = userInfoService.selectByPrimaryKey(id);
//        modelMap.addAttribute("user", user);
//        return view_base + "userinfoedit";
//    }
//
//    /**
//     * 日志编辑
//     *
//     * @param id
//     * @return
//     */
//    @RequestMapping("/dairyEdit")
//    public String dairyEdit(@RequestParam(value = "id", required = false) Integer id) {
//
//        return view_base + "dairyedit";
//    }
//
//    /**
//     * 用户信息提交
//     *
//     * @param user
//     * @param request
//     * @param avatar
//     * @return
//     * @throws IOException
//     */
//    @RequestMapping(value = "/userinfoSubmit", method = RequestMethod.POST)
//    @ResponseBody
//    public String userinfoSubmit(@ModelAttribute BaseUser user, HttpServletRequest request,
//                                 @RequestParam(value = "avatarSub", required = false) MultipartFile avatar
//    ) throws IOException {
//        logger.error("----------userinfoSubmit start-----------");
//        String cate = "avatar-user";
//        FileResult fileResult = null;
//        BaseUser baseUser = new BaseUser();
//
//        if (avatar.getOriginalFilename() != null && avatar.getOriginalFilename() != "") {
//            logger.error("----------userinfoSubmit if-----------");
//            fileResult = FileUploadService.picSubmit(request, cate, avatar, user.getUid());
//            baseUser.setUid(user.getUid());
//            baseUser.setUserName(user.getUserName());
//            baseUser.setAvatar(fileResult.getAvatarUrl());
//        } else {
//            baseUser.setUid(user.getUid());
//            baseUser.setUserName(user.getUserName());
//        }
//        userInfoService.updateByPrimaryKeySelective(baseUser);
//        return null;
//    }

}
