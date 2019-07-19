package com.chengxi.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CHENGXI
 * @date 2019/7/19
 */
@Controller
public class IndexController {
    @RequestMapping("/getIndex")
    public String getIndex() {
        System.out.println("请求进来了");
        return "index";
    }
}
