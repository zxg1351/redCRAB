package com.redofmaple.Service.impl;

import com.zxg.maplehourse.bean.ResultInfo;
import com.zxg.maplehourse.common.utils.SecurityUtil;
import com.zxg.maplehourse.model.MResetPsdModel;
import com.zxg.maplehourse.model.MUserModel;
import com.zxg.maplehourse.repository.MUserRepository;
import com.zxg.maplehourse.service.MUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MUserServiceImpl implements MUserService {

    private static final Logger logger = LoggerFactory.getLogger(MUserServiceImpl.class);
    @Autowired
    private MUserRepository mUserRepository;

    @Value("${crypt.key}")
    private String cryptKey;

    @Override
    public ResultInfo selectAllUser() {

        ResultInfo resultInfo = new ResultInfo();

        List<MUserModel> mUserModelList = mUserRepository.findAll();

        if (!CollectionUtils.isEmpty(mUserModelList)) {

            resultInfo.setAppData(mUserModelList);
            logger.debug("用户列表信息显示");
        } else {
            logger.debug("暂无用户列表信息显示");
        }
        return resultInfo;
    }


    /**
     * 新建用户
     *
     * @param mUserModel
     * @return
     */
    @Override
    public ResultInfo saveUser(MUserModel mUserModel) {

        ResultInfo resultInfo = new ResultInfo();
        List<MUserModel> mUserModelList = checkUserAccountAndTel(mUserModel.getMUserAccount(), mUserModel.getMUserTel());

        if (CollectionUtils.isEmpty(mUserModelList)) {

            mUserModel.setCreateTime(new Date());
            mUserModel.setCreateUser(1);
            mUserModel.setDelFlag("0");
            try {
                String passWord = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(mUserModel.getMUserPassword())));
                mUserModel.setMUserPassword(passWord);
            } catch (Exception e) {
                e.printStackTrace();
            }
            MUserModel userModel = mUserRepository.save(mUserModel);

            resultInfo.setAppData(userModel);
            resultInfo.setResultCode("success");
        } else {
            resultInfo.setResultCode("failure");
            resultInfo.setResultMessage("该用户名或手机号已创建");
        }
        return resultInfo;
    }

    /**
     * 登录时,用户进行校验
     *
     * @param mUserModel
     * @return
     */
    @Override
    public ResultInfo checkUser(MUserModel mUserModel) {
        List<MUserModel> mUserModelList = new ArrayList<>();

        ResultInfo resultInfo = new ResultInfo();
        try {
            String passWord = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(mUserModel.getMUserPassword())));
            mUserModelList = mUserRepository.findByMUserAccountAndMUserPassword(mUserModel.getMUserAccount(), passWord);

            if (!CollectionUtils.isEmpty(mUserModelList)) {

                resultInfo.setResultCode("success");

            } else {
                resultInfo.setResultCode("failure");
                resultInfo.setResultMessage("该用户名不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultInfo;
    }

    @Override
    public Page<MUserModel> selectPageUser(Pageable pageable) {

        MUserModel mUserModel = new MUserModel();

        Page<MUserModel> modelPage = mUserRepository.findByDelFlag("0", pageable);


        return modelPage;
    }

    @Override
    public ResultInfo findById(Integer id) {

        ResultInfo resultInfo = new ResultInfo();
        MUserModel mUserModel = mUserRepository.findOne(id);
        resultInfo.setAppData(mUserModel);
        resultInfo.setResultMessage("查询成功");
        resultInfo.setResultCode("success");
        return resultInfo;
    }


    @Override
    public ResultInfo updateUser(MUserModel mUserModel) {

        ResultInfo resultInfo = new ResultInfo();
        mUserModel.setUpdateTime(new Date());
        mUserModel.setCreateUser(1);
        int userModel = mUserRepository.setmUesrName(mUserModel.getMUserName(), mUserModel.getMUserTel(), mUserModel.getId());
        resultInfo.setAppData(userModel);
        resultInfo.setResultCode("success");
        resultInfo.setResultMessage("");
        return resultInfo;
    }

    @Override
    public Page<MUserModel> selectUser(MUserModel mUserModel) {

        ResultInfo resultInfo = new ResultInfo();
        Page<MUserModel> modelPage = mUserRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mUserName = root.get("mUserName").as(String.class);
                Expression<String> mUserTel = root.get("mUserTel").as(String.class);
                Expression<String> delFlag = root.get("delFlag").as(String.class);
                Expression<String> mUserAccount = root.get("mUserAccount").as(String.class);

//                Predicate predicate = criteriaBuilder.or(
//                        criteriaBuilder.like(mUserName, "%" + mUserModel.getMUserName() + "%"),
//                        criteriaBuilder.like(mUserTel, "%" + mUserModel.getMUserTel() + "%"),
//                        criteriaBuilder.like(mUserAccount, "%" + mUserModel.getMUserAccount() + "%")
//                );
//                Predicate predicate = criteriaBuilder.like(mUserName, "%" + mUserModel.getMUserName() + "%");
//
//                criteriaQuery.where(predicate);
//                Predicate predicate = ;
//                Predicate predicate = ;
                criteriaQuery.where(criteriaBuilder.like(mUserName, "%" + mUserModel.getMUserName() + "%"),
                        criteriaBuilder.equal(delFlag, "0")
//                        criteriaBuilder.like(mUserTel, "%" + mUserModel.getMUserTel() + "%")
                );
//                criteriaQuery.where(predicate);
                return null;
            }
        }, new PageRequest(0, 10));


//        resultInfo.setAppData(modelPage);
        return modelPage;
    }

    @Override
    public ResultInfo delUserById(Integer id) {
        ResultInfo resultInfo = new ResultInfo();
        int a = mUserRepository.updateStatus("1", 1, new Date(), id);
        resultInfo.setAppData(a);
        return resultInfo;
    }

    @Override
    public ResultInfo resetPsdModal(MResetPsdModel mResetPsdModel) {

        ResultInfo resultInfo = new ResultInfo();


        if (mResetPsdModel.getOldPassword().equals(mResetPsdModel.getNewPassword())){

            resultInfo.setResultMessage("新旧密码不能一致！！！");
            return resultInfo;
        }else if (mResetPsdModel.getNewPassword().equals(mResetPsdModel.getOldPassword())){
            resultInfo.setResultMessage("两次输入密码不一致！！！");
            return resultInfo;
        }
        try {
            String passWord = SecurityUtil.createSHA1(cryptKey.concat(SecurityUtil.decodeBase64(mResetPsdModel.getNewPassword())));
            int a = mUserRepository.updatePassword(passWord,mResetPsdModel.getId());
            resultInfo.setAppData(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultInfo;
    }

    /**
     * 校验用户名和手机号码
     *
     * @param mUserAccount
     * @param mUserTel
     * @return
     */
    private List<MUserModel> checkUserAccountAndTel(String mUserAccount, String mUserTel) {


        List<MUserModel> mUserModelList = mUserRepository.findByMUserAccountOrMUserTel(mUserAccount, mUserTel);
        return mUserModelList;
    }


}
