package com.example.demo.board;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface boardMapper {
    public List<boardVO> selectBoardList() throws Exception;
}
