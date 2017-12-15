package com.example.demo.finance.service.impl;

import com.example.demo.finance.service.FinanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "financeService")
public class FinanceServiceImpl implements FinanceService {
    private static final Logger log = LoggerFactory.getLogger(FinanceServiceImpl.class);
    @Value("${server.port}")
    String port;
    @Override
    public String sayHi() {
        log.info("sayHi called");
        return "Hi,i am financeService from port:" +port;
    }
}
