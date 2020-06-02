package com.nowcoder.community.controller;

import com.nowcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //有这样的注解的bean才会被扫描或者@service, @Repository,他们都是由@Component实现的
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired              //controller依赖service执行服务
    private AlphaService alphaService;

    @RequestMapping("/data")
    @ResponseBody           //返回给浏览器的response体
    public  String getDate(){
        return alphaService.find();
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello Spring Boot.";
    }

}
