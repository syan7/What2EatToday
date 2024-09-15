package com.syan.what2eattoday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : syan
 * @date : 2024/9/15
 * @comment :
 */

@Controller
public class LoginController {
    @RequestMapping("/{page}")
    public String index(@PathVariable String page) {
        return page;
    }
}
