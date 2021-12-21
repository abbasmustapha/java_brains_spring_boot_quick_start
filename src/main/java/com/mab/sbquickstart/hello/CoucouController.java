package com.mab.sbquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoucouController {

    @RequestMapping("/coucou")
    public String sayCoucou(){
        return "Coucou";
    }
}
