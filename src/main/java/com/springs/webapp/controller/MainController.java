package com.springs.webapp.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author wzy5223
 * @date 2018/11/27 下午13:53
 */
@RestController
public class MainController {
    /**
     * @RestController           相当于 @Controller + @ResponseBody
     * @GetMapping("/hello") 相当于 @RequestMapping(value = "/hello",method = RequestMethod.GET)
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "Hello, SpringBoot!";
    }
}
