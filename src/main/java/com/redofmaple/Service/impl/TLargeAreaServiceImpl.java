package com.redofmaple.service.impl;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MTbLargeAreaEntity;
import com.redofmaple.repository.TLargeAreaRepository;
import com.redofmaple.service.TLargeAreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class TLargeAreaServiceImpl implements TLargeAreaService {
    private static final Logger logger = LoggerFactory.getLogger(TLargeAreaServiceImpl.class);
    @Autowired
    private TLargeAreaRepository tLargeAreaRepository;

    @Override
    public ResultInfo saveLargeArea(MTbLargeAreaEntity tLargeAreaModel) {
        return null;
    }

    @Override
    public ResultInfo findById(Integer largeAreaId) {
        return null;
    }

    @Override
    public ResultInfo editLargeArea(MTbLargeAreaEntity tLargeAreaModel) {
        return null;
    }

    @Override
    public ResultInfo deleteLargeAreaById(Integer largeAreaId) {
        return null;
    }

    @Override
    public ResultInfo selectAllTLargeArea() {

        ResultInfo resultInfo = new ResultInfo();

        List<MTbLargeAreaEntity> areaModelList = tLargeAreaRepository.findAll();
        if (!CollectionUtils.isEmpty(areaModelList)) {

            resultInfo.setAppData(areaModelList);
            logger.debug("大区域列表所示：");

        } else {

            logger.debug("暂无大区域信息数据");
        }
        return resultInfo;
    }

    @Override
    public Page<MTbLargeAreaEntity> selectAllpageLargeArea(Pageable page) {
        Page<MTbLargeAreaEntity> areaModelList = tLargeAreaRepository.findAll(page);
        if (!CollectionUtils.isEmpty(areaModelList.getContent())) {

            logger.debug("大区域列表所示：");

        } else {

            logger.debug("暂无大区域信息数据");
        }
        return areaModelList;
    }


}
