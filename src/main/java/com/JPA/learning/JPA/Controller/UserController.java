package com.JPA.learning.JPA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
   
    @RequestMapping("/addUser")
    public String user(){
        System.out.println("kalaivanannanan ##############################");
        return "index";
    }
    
}
