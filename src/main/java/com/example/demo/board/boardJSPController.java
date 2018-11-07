package com.example.demo.board;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class boardJSPController {

    @Autowired
    boardService svc;

    @RequestMapping(value = "hello_jsp")
    public String hello_jsp(Model model){
        model.addAttribute("id", 1);
        model.addAttribute("name","홍길동");
        model.addAttribute("nickname","가나다라ABCD별칭");

        return "hello";
    }

    @RequestMapping(value="board_write")
    @Transactional
    public void board_write(@ModelAttribute("boardVO") boardVO data){
        svc.addBoard(data);
        log.info("정상 등록");
    }

    @RequestMapping(value="input")
    public String wirte_jsp(Model model){
        return "input";
    }

}
