package com.kai.limitsservice.controller;

import com.kai.limitsservice.bean.Limits;
import com.kai.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Configuration configuration;

    public Controller(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {
//        return new Limits(1, 1000);
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}
