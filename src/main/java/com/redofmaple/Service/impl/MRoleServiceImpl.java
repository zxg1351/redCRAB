package com.redofmaple.service.impl;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MMRoleEntity;
import com.redofmaple.repository.MRoleRepository;
import com.redofmaple.service.MRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.persistence.criteria.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Service
public class MRoleServiceImpl implements MRoleService {

    private static final Logger logger = LoggerFactory.getLogger(MRoleServiceImpl.class);

    @Autowired
    private MRoleRepository mRoleRepository;

    @Override
    public ResultInfo selectAllRole() {


        ResultInfo resultInfo = new ResultInfo();

        List<MMRoleEntity> mRoleModelList = mRoleRepository.findAll();

        if (!CollectionUtils.isEmpty(mRoleModelList)) {

            resultInfo.setAppData(mRoleModelList);
            logger.debug("角色列表信息显示");
        } else {

            logger.debug("暂无角色列表信息显示");
        }
        return resultInfo;
    }

    @Override
    public Page<MMRoleEntity> selectPageRole(Pageable pageable) {

        Page<MMRoleEntity> modelPage = mRoleRepository.findAll(pageable);
        return modelPage;
    }

    @Override
    public ResultInfo saveRole(MMRoleEntity mRoleModel) {

        ResultInfo resultInfo = new ResultInfo();

        mRoleModel.setCreateTime(new Timestamp(System.currentTimeMillis()));
        mRoleModel.setCreateUser(1);
        mRoleModel.setDelFlag("0");


        MMRoleEntity model = mRoleRepository.save(mRoleModel);
        resultInfo.setAppData(model);
        resultInfo.setResultMessage("成功新建角色");
        return resultInfo;
    }

    @Override
    public ResultInfo findById(Integer id) {

        ResultInfo resultInfo = new ResultInfo();
        MMRoleEntity model = mRoleRepository.findOne(id);
        resultInfo.setAppData(model);
        resultInfo.setResultMessage("查询成功");
        resultInfo.setResultCode("success");
        return resultInfo;
    }

    @Override
    public ResultInfo editRole(MMRoleEntity mRoleModel) {

        ResultInfo resultInfo = new ResultInfo();

        int result = 0;

        resultInfo.setAppData(result);
        resultInfo.setResultMessage("修改成功");
        resultInfo.setResultCode("success");
        return resultInfo;
    }

    @Override
    public ResultInfo deleteRoleById(Integer id) {

        ResultInfo resultInfo = new ResultInfo();

        int result = 0;
        resultInfo.setAppData(result);
        return resultInfo;
    }

}
