package com.redofmaple.controller;


import com.redofmaple.common.bean.ApiResult;
import com.redofmaple.domain.Users;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(value = "用户")
public class UserResource {

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<Users> getUserList() {
        List<Users> r = new ArrayList<Users>();
        return r;
    }

    @ApiOperation(value = "登录",notes = "")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ApiResult userLogin(){

        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

//    @ApiOperation(value = "注册")
}

