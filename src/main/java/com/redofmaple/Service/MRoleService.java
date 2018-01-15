package com.redofmaple.service;

import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MMRoleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface MRoleService {

    ResultInfo selectAllRole();

    Page<MMRoleEntity> selectPageRole(Pageable pageable);


    ResultInfo saveRole(MMRoleEntity mRoleModel);


    ResultInfo findById(Integer id);

    ResultInfo editRole(MMRoleEntity mRoleModel);

    ResultInfo deleteRoleById(Integer id);

}
