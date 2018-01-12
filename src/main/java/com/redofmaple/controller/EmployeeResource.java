package com.redofmaple.controller;


import com.redofmaple.domain.Users;
import com.redofmaple.entity.gen.MUser;
import com.redofmaple.entity.gen.MUserExample;
import com.redofmaple.mapper.MUserMapper;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/employee")
@Api(tags = "员工管理",value = "员工信息",description = "EmployeeResource")
public class EmployeeResource {

    @Autowired
    private MUserMapper mUserMapper;


    @ApiOperation(value = "获取员工列表", notes = "传入参数用户实体")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<Users> getUserList(@RequestBody @ApiParam(name = "用户对象" ,value="传入json格式",required=true) Users users) {
        List<Users> r = new ArrayList<Users>();
        return r;
    }

    @ApiOperation(value = "获取test数据库列表", notes = "1212121212")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType = "query",name = "id",value = "用户id",required = true, dataType = "String")

    })
    @PostMapping("/getEmployeeList")
    public List<MUser> getUser(String id) {
        List<MUser> mUserList = new ArrayList<>();
        MUserExample mUserExample = new MUserExample();
        mUserExample.createCriteria().andDelFlagEqualTo("0");

        mUserList = mUserMapper.selectByExample(mUserExample);
        return mUserList;

    }

}

