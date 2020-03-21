package com.zjj.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zjj on 2010/3/20
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
