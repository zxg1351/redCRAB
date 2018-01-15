package com.redofmaple.service;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MTbUserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface MUserService {



    ResultInfo selectAllUser();


    ResultInfo saveUser(MTbUserEntity mUserModel);

    ResultInfo checkUser(MTbUserEntity mUserModel);

    Page<MTbUserEntity> selectPageUser(Pageable pageable);

    ResultInfo findById(Integer id);

    ResultInfo updateUser(MTbUserEntity mUserModel);

    Page<MTbUserEntity> selectUser(MTbUserEntity mUserModel);

    ResultInfo delUserById(Integer id);

//    ResultInfo resetPsdModal(MResetPsdModel mResetPsdModel);
}
