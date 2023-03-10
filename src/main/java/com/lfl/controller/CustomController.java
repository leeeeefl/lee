package com.lfl.controller;

import com.lfl.pojo.CustomInfo;
import com.lfl.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
    @Autowired
    CustService custService;
    @GetMapping("/custom/findCustomInfo")
    public CustomInfo hello() {
        CustomInfo customInfo = new CustomInfo();
        customInfo.setId(1L);
        return custService.getCustInfo(customInfo);
    }
}
