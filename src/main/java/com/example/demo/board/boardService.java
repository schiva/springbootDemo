package com.example.demo.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class boardService {

    @Autowired
    private boardMapper mapper;

    public void addBoard(boardVO data){
        mapper.insertBoard(data);
    }


}
