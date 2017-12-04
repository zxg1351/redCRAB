package com.redofmaple.common.bean;

import lombok.Data;

import java.io.Serializable;


@Data
public class ResponseInfoBean implements Serializable {

    private String token;
    private String messageInfo;
    private boolean status;
    private String data;
    private String name;


    public ResponseInfoBean(String token, String messageInfo, boolean status, String data, String name) {
        this.token = token;
        this.messageInfo = messageInfo;
        this.status = status;
        this.data = data;
        this.name = name;
    }
}
