package com.redofmaple.service.impl;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MTbAreaEntity;
import com.redofmaple.domain.MTbCityEntity;
import com.redofmaple.domain.MTbProvinceEntity;
import com.redofmaple.repository.MAreaRepository;
import com.redofmaple.repository.MCityRepository;
import com.redofmaple.repository.MProvinceRepository;
import com.redofmaple.service.MRegionService;
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
import java.util.List;


@Service
public class MRegionServiceImpl implements MRegionService {

    private static final Logger logger = LoggerFactory.getLogger(MRegionServiceImpl.class);
    @Autowired
    private MAreaRepository mAreaRepository;

    @Autowired
    private MCityRepository mCityRepository;

    @Autowired
    private MProvinceRepository mProvinceRepository;


    @Override
    public ResultInfo selectArea() {
        ResultInfo resultInfo = new ResultInfo();

        List<MTbAreaEntity> mAreaModelList = mAreaRepository.findAll();


        if (!CollectionUtils.isEmpty(mAreaModelList)) {
            resultInfo.setAppData(mAreaModelList);
            logger.debug("区域信息列表显示");
        } else {
            logger.debug("暂无区域信息列表显示");
        }


        return resultInfo;
    }

    @Override
    public ResultInfo selectCity() {

        ResultInfo resultInfo = new ResultInfo();

//        List<MCityModel> mCityModelList = mCityRepository.findAll();
        Page<MTbCityEntity> mCityModelList = mCityRepository.findAll(new PageRequest(1, 20));
//        if (!CollectionUtils.isEmpty(mCityModelList)) {
        resultInfo.setAppData(mCityModelList);
        logger.debug("城市列表显示");
//        } else {
        logger.debug("暂无城市列表信息显示");
//        }
        return resultInfo;
    }

    @Override
    public ResultInfo selectProvice() {

        ResultInfo resultInfo = new ResultInfo();
        List<MTbProvinceEntity> mProvinceModelList = mProvinceRepository.findAllBy();

//        Page<MProvinceModel> mProvinceModelList = mProvinceRepository.findAll(new PageRequest(1,20));
        if (!CollectionUtils.isEmpty(mProvinceModelList)) {

            resultInfo.setAppData(mProvinceModelList);
            logger.debug("省列表信息显示");
        } else {
//
            logger.debug("暂无省列表信息显示");
        }
        return resultInfo;
    }

    @Override
    public Page<MTbCityEntity> selectPageCity(Pageable pageable) {

        Page<MTbCityEntity> modelPage = mCityRepository.findAll(pageable);
        return modelPage;
    }


    @Override
    public Page<MTbProvinceEntity> selectPageProvince(Pageable pageable) {
        Page<MTbProvinceEntity> modelPage = mProvinceRepository.findAll(pageable);
        return modelPage;
    }

    @Override
    public Page<MTbProvinceEntity> selectPageProvince(MTbProvinceEntity mProvinceModel) {

        Page<MTbProvinceEntity> modelPage = mProvinceRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mProvinceName = root.get("mProvinceName").as(String.class);

//                Predicate predicate =
                criteriaQuery.where(criteriaBuilder.like(mProvinceName, "%" + mProvinceModel.getmProvinceName() + "%"));
                ;
                return null;
            }
        }, new PageRequest(0, 10));
        return modelPage;
    }

    @Override
    public Page<MTbAreaEntity> selectPageArea(Pageable pageable) {
        Page<MTbAreaEntity> modelPage = mAreaRepository.findAll(pageable);
        return modelPage;
    }

    @Override
    public Page<MTbAreaEntity> selectArea(MTbAreaEntity mAreaModel) {
        Page<MTbAreaEntity> mAreaModels = mAreaRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mAreaName = root.get("mAreaName").as(String.class);


                Predicate predicate = criteriaBuilder.like(mAreaName, "%" + mAreaModel.getTbAreaName() + "%");

                criteriaQuery.where(predicate);
                return null;
            }
        }, new PageRequest(0, 10));

        return mAreaModels;
    }


    @Override
    public Page<MTbCityEntity> selectCity(MTbCityEntity mCityModel) {
        Page<MTbCityEntity> mCityModels = mCityRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mCityName = root.get("mCityName").as(String.class);


                Predicate predicate = criteriaBuilder.like(mCityName, "%" + mCityModel.getTbCityName() + "%");

                criteriaQuery.where(predicate);
                return null;
            }
        }, new PageRequest(0, 10));

        return mCityModels;
    }
}
