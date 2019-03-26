package cn.pings.web.bill.controller;

import cn.pings.service.api.sys.entity.User;
import cn.pings.service.api.sys.service.UserService;
import cn.pings.web.bill.util.JwtUtil;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *********************************************************
 ** @desc  ： 基础Controller
 ** @author  Pings
 ** @date    2019/1/22
 ** @version v1.0
 * *******************************************************
 */
public abstract class AbstractBaseController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected UserService iUserService;

    /**获取当前用户名称*/
    protected String getCurrentUserName(){
        String token = SecurityUtils.getSubject().getPrincipal().toString();
        return JwtUtil.getUserName(token);
    }

    /**获取当前用户*/
    protected User getCurrentUser() {
        return this.iUserService.getByUserName(this.getCurrentUserName());
    }
}
