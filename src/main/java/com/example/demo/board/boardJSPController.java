package com.example.demo.board;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class boardJSPController {

    @RequestMapping(value = "hello_jsp")
    public String hello_jsp(Model model){
        model.addAttribute("id", 1);
        model.addAttribute("name","홍길동");
        model.addAttribute("nickname","가나다라ABCD별칭");

        return "hello";
    }
}
