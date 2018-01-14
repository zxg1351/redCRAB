package com.redofmaple.Service.impl;

import com.zxg.maplehourse.bean.ResultInfo;
import com.zxg.maplehourse.model.MAreaModel;
import com.zxg.maplehourse.model.MCityModel;
import com.zxg.maplehourse.model.MProvinceModel;
import com.zxg.maplehourse.repository.MAreaRepository;
import com.zxg.maplehourse.repository.MCityRepository;
import com.zxg.maplehourse.repository.MProvinceRepository;
import com.zxg.maplehourse.service.MRegionService;
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

        List<MAreaModel> mAreaModelList = mAreaRepository.findAll();


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
        Page<MCityModel> mCityModelList = mCityRepository.findAll(new PageRequest(1, 20));
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
        List<MProvinceModel> mProvinceModelList = mProvinceRepository.findAllBy();

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
    public Page<MCityModel> selectPageCity(Pageable pageable) {

        Page<MCityModel> modelPage = mCityRepository.findAll(pageable);
        return modelPage;
    }


    @Override
    public Page<MProvinceModel> selectPageProvince(Pageable pageable) {
        Page<MProvinceModel> modelPage = mProvinceRepository.findAll(pageable);
        return modelPage;
    }

    @Override
    public Page<MProvinceModel> selectPageProvince(MProvinceModel mProvinceModel) {

        Page<MProvinceModel> modelPage = mProvinceRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mProvinceName = root.get("mProvinceName").as(String.class);

//                Predicate predicate =
                criteriaQuery.where(criteriaBuilder.like(mProvinceName, "%" + mProvinceModel.getMProvinceName() + "%"));
                ;
                return null;
            }
        }, new PageRequest(0, 10));
        return modelPage;
    }

    @Override
    public Page<MAreaModel> selectPageArea(Pageable pageable) {
        Page<MAreaModel> modelPage = mAreaRepository.findAll(pageable);
        return modelPage;
    }

    @Override
    public Page<MAreaModel> selectArea(MAreaModel mAreaModel) {
        Page<MAreaModel> mAreaModels = mAreaRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mAreaName = root.get("mAreaName").as(String.class);


                Predicate predicate = criteriaBuilder.like(mAreaName, "%" + mAreaModel.getMAreaName() + "%");

                criteriaQuery.where(predicate);
                return null;
            }
        }, new PageRequest(0, 10));

        return mAreaModels;
    }


    @Override
    public Page<MCityModel> selectCity(MCityModel mCityModel) {
        Page<MCityModel> mCityModels = mCityRepository.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Expression<String> mCityName = root.get("mCityName").as(String.class);


                Predicate predicate = criteriaBuilder.like(mCityName, "%" + mCityModel.getMCityName() + "%");

                criteriaQuery.where(predicate);
                return null;
            }
        }, new PageRequest(0, 10));

        return mCityModels;
    }
}
