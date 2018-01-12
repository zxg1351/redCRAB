package com.redofmaple.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "用户实体",description = "用户信息")
public class Users implements Serializable{


    @ApiModelProperty(value = "喂喂喂",notes = "用户ID")
    private String id;
    @ApiModelProperty(value = "喂喂喂12",notes = "姓名")
    private String name;

    @ApiModelProperty(value = "喂喂喂123",notes = "年龄")
    private String age;
    @ApiModelProperty(value="用户名",name="username",example="xingguo")
    private String username;
    @ApiModelProperty(value="状态",name="state",required=true)
    private Integer state;
    private String password;
    private String nickName;
    private Integer isDeleted;
}
