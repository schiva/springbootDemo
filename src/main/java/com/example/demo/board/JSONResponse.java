package com.example.demo.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JSONResponse<T> {
    private int code;
    private String message;
    private String messageDeail;
    private T data;

    public JSONResponse() {
        super();
    }

    public JSONResponse(int code, String message, String messageDetail, T data ) {
        this.code = code;
        this.message = message;
        this.messageDeail = messageDetail;
        this.data = data;
    }
}
