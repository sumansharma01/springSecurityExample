package com.example.springsecurityexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleForAuthorization {

    @RequestMapping(method = RequestMethod.GET,value="/")
    public String unauthorized(){
        return ("<h1>All users including non authorized can access this</h1>");
    }

    @RequestMapping("/user")
    public String users(){
        return ("<h1>Only users can access this</h1>");
    }

    @RequestMapping("/admin")
    public String admin(){
        return ("<h1>Only admins can access this</h1>");
    }
}
