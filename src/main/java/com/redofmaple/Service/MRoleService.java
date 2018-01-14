package com.redofmaple.Service;

import com.zxg.maplehourse.bean.ResultInfo;
import com.zxg.maplehourse.model.MRoleModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface MRoleService {

    ResultInfo selectAllRole();

    Page<MRoleModel> selectPageRole(Pageable pageable);


    ResultInfo saveRole(MRoleModel mRoleModel);


    ResultInfo findById(Integer id);

    ResultInfo editRole(MRoleModel mRoleModel);

    ResultInfo deleteRoleById(Integer id);


    Page<MRoleModel> selectRole(MRoleModel mRoleModel);
}
