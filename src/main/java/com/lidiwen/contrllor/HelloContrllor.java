package com.lidiwen.contrllor;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by ASUS on 2018/8/29.
 */
@RestController
public class HelloContrllor {
//    @RequestMapping(value = "/hello", method = GET)
//    public String hello() {
//        return "hello springboot!";
//    }

    @RequestMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
