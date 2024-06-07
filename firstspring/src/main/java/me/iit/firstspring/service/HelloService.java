package me.iit.firstspring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {


    public String getMessage(){
        return "Hello World!";
    }
}
