package com.ucl.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jiang.zheng on 2017/9/22.
 */
@Controller
@RequestMapping(value = "admin")
public class LoginController {

    @RequestMapping(value = "login")
    public String login(HttpServletRequest request) {
        return "login";
    }
}
