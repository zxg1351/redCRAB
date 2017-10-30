package com.redofmaple.controller;


import com.redofmaple.domain.Users;
import com.redofmaple.entity.gen.MUser;
import com.redofmaple.entity.gen.MUserExample;
import com.redofmaple.mapper.MUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(value = "用户")
public class UserResource {

    @Autowired
    private MUserMapper mUserMapper;


    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<Users> getUserList() {
        List<Users> r = new ArrayList<Users>();
        return r;
    }

    @ApiOperation(value = "获取test数据库列表", notes = "")
    @PostMapping("/getUserList")
    public List<MUser> getUser() {
        List<MUser> mUserList = new ArrayList<>();
        MUserExample mUserExample = new MUserExample();
        mUserExample.createCriteria().andDelFlagEqualTo("0");

        mUserList = mUserMapper.selectByExample(mUserExample);
        return mUserList;

    }

}

