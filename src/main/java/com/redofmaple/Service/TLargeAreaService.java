package com.redofmaple.service;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MTbLargeAreaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface TLargeAreaService {
    ResultInfo selectAllTLargeArea();


    Page<MTbLargeAreaEntity> selectAllpageLargeArea(Pageable page);


    ResultInfo saveLargeArea(MTbLargeAreaEntity tLargeAreaModel);

    ResultInfo findById(Integer largeAreaId);

    ResultInfo editLargeArea(MTbLargeAreaEntity tLargeAreaModel);

    ResultInfo deleteLargeAreaById(Integer largeAreaId);
}
