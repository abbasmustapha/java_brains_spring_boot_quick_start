package com.mab.courseapidata.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalamController {

    @RequestMapping("/salam")
    public String saySalam(){
        return "Salam ";
    }
}
