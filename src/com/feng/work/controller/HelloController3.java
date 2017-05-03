package com.feng.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jarry on 2017/5/2.
 */
@Controller
public class HelloController3 {
    @RequestMapping("/hello3")
    //@ResponseBody
    public String method() {
        return "redirect:/hello ";
    }

}
