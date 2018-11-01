package com.example.demo.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class boardVO {
    private int IDX;
    private int PARENT_IDX;
    private String TITLE;
    private String CONTENTS;
    private int HIT_CNT;
    private String DEL_GB;
    private String CREA_DTM;

}
