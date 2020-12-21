package com.segyan.referencewebapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestController
public class MainController {

	@RequestMapping("/status")
    public String getStatus(){
        return new Date().toString();
    }
    
	@RequestMapping("/check-status")
    public String updateStatus(){
        return "Success";
    }
}
