package com.redofmaple.service.impl;

import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.common.utils.UtilsTools;
import com.redofmaple.domain.MTbBannerEntity;
import com.redofmaple.model.MBannersModel;
import com.redofmaple.repository.MBannerRepository;
import com.redofmaple.service.MBannerService;
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

/**
 * Created by Administrator on 2017/8/18.
 */
@Service
public class MBannerServiceImpl implements MBannerService {
    private static final Logger logger = LoggerFactory.getLogger(MBannerServiceImpl.class);
    @Autowired
    private MBannerRepository mBannerRepository;


    @Override
    public ResultInfo selectAllBanner(String mBannerName) {
        ResultInfo resultInfo = new ResultInfo();

        List<MTbBannerEntity> mBannerModelList = mBannerRepository.findAll();
        if (!CollectionUtils.isEmpty(mBannerModelList)) {
            resultInfo.setAppData(mBannerModelList);
            logger.debug("查询轮播图成功");
        } else {
            logger.debug("无轮播图信息");
        }
        return resultInfo;
    }

    @Override
    public ResultInfo insertBanner(MTbBannerEntity mBannerModel) {
        ResultInfo resultInfo = new ResultInfo();
//        MBannerModel mBannerModel1 = new MBannerModel();
//        mBannerModel1.setMBannerName("轮播图5");
//        mBannerModel1.setMBannerUrl("http://pic.qiantucdn.com/58pic/11/24/04/67U58PIC2Db.jpg!/fw/780/watermark/url/L3dhdGVybWFyay12MS4zLnBuZw==/align/center");
//        mBannerModel1.setMBannerType("0");
        mBannerModel.setCreateTime(new Timestamp(System.currentTimeMillis()));
        mBannerModel.setCreateUser(1);
        MTbBannerEntity mBannerModel2 = mBannerRepository.save(mBannerModel);
        resultInfo.setAppData(mBannerModel2);
        logger.debug("新建轮播图成功");
        return resultInfo;
    }

    @Override
    public Page<MTbBannerEntity> selectPageBanner(Pageable pageable) {

        Page<MTbBannerEntity> modelPage = mBannerRepository.findByDelFlag("0", pageable);
        return modelPage;
    }

    @Override
    public ResultInfo findById(Integer mbannerId) {

        ResultInfo resultInfo = new ResultInfo();
        MTbBannerEntity mBannerModel = mBannerRepository.findOne(mbannerId);
        resultInfo.setAppData(mBannerModel);
        return resultInfo;
    }

    @Override
    public ResultInfo editBanner(MTbBannerEntity mBannerModel) {
        ResultInfo resultInfo = new ResultInfo();
        MTbBannerEntity mTbBannerEntity = mBannerRepository.findOne(mBannerModel.getId());

        MTbBannerEntity result = mBannerRepository.save(mTbBannerEntity);

        resultInfo.setAppData(result);
        resultInfo.setResultMessage("修改成功");
        resultInfo.setResultCode("success");
        return resultInfo;
    }

    @Override
    public ResultInfo deleteById(Integer mBannerId) {

        ResultInfo resultInfo = new ResultInfo();
        MTbBannerEntity mTbBannerEntity = mBannerRepository.findOne(mBannerId);
        mTbBannerEntity.setDeleteFlag("1");//删除标识
        mTbBannerEntity.setUpdateTime(new Timestamp(System.currentTimeMillis()));
//        mTbBannerEntity.setUpdateUser(UtilsTools.generateUUID());
//        int result = mBannerRepository.deleteBannerById(1, new Date(), "1", mbannerId);

        MTbBannerEntity result = mBannerRepository.save(mTbBannerEntity);
        resultInfo.setAppData(result);
        resultInfo.setResultMessage("删除成功");
        resultInfo.setResultCode("success");
        return null;
    }

    @Override
    public Page<MTbBannerEntity> selectBanner(MTbBannerEntity mBannerModel) {

        Page<MTbBannerEntity> mBannerModels = mBannerRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mBannerName = root.get("mBannerName").as(String.class);
                Expression<String> delFlag = root.get("delFlag").as(String.class);

                Predicate predicate = criteriaBuilder.like(mBannerName, "%" + mBannerModel.getMBannerName() + "%");

                criteriaQuery.where(predicate, criteriaBuilder.equal(delFlag, "0"));
                return null;
            }
        }, new PageRequest(0, 10));

        return mBannerModels;
    }
}
