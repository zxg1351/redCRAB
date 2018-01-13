package com.redofmaple.resource;


import com.redofmaple.domain.Users;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(tags = "用户管理",value = "用户",description = "UserResource")
public class UserResource {

//    @Autowired
//    private MUserMapper mUserMapper;


    @ApiOperation(value = "获取用户列表", notes = "传入参数用户实体")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<Users> getUserList(@RequestBody @ApiParam(name = "用户对象" ,value="传入json格式",required=true) Users users) {
        List<Users> r = new ArrayList<Users>();
        return r;
    }

//    @ApiOperation(value = "获取test数据库列表", notes = "1212121212")
//    @ApiImplicitParams({
//        @ApiImplicitParam(paramType = "query",name = "id",value = "用户id",required = true, dataType = "String")
//
//    })
//    @PostMapping("/getUserList")
//    public List<MUser> getUser(String id) {
//        List<MUser> mUserList = new ArrayList<>();
//        MUserExample mUserExample = new MUserExample();
//        mUserExample.createCriteria().andDelFlagEqualTo("0");
//
//        mUserList = mUserMapper.selectByExample(mUserExample);
//        return mUserList;
//
//    }

}

