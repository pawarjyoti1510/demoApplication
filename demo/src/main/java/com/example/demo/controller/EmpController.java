package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/employee")
public class EmpController {

    @GetMapping("/hell0")
    public String getMSG(){
        return "hii";
    }




}
