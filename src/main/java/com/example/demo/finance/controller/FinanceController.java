package com.example.demo.finance.controller;

import com.example.demo.finance.service.FinanceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FinanceController {
    @Resource
    FinanceService financeService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return financeService.sayHi();
    }
}
