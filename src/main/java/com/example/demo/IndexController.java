package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public DataVO index(){
        DataVO data = new DataVO();
        data.name = "홍길동";
        data.phone= "010-0000-0001";

        return data;
    }



}
