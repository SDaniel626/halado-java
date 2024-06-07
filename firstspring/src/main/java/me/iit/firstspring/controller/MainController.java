package me.iit.firstspring.controller;

import me.iit.firstspring.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final HelloService helloService;

    public MainController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    public String main(){
        return helloService.getMessage();
    }
}
