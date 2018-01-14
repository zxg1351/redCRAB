package com.redofmaple.Service;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MTbAreaEntity;
import com.redofmaple.domain.MTbCityEntity;
import com.redofmaple.domain.MTbProvinceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface MRegionService {


    ResultInfo selectArea();


    ResultInfo selectCity();


    ResultInfo selectProvice();

    Page<MTbCityEntity> selectPageCity(Pageable pageable);

    Page<MTbProvinceEntity> selectPageProvince(Pageable pageable);

    Page<MTbProvinceEntity> selectPageProvince(MTbProvinceEntity mProvinceModel);

    Page<MTbAreaEntity> selectPageArea(Pageable pageable);


    Page<MTbAreaEntity> selectArea(MTbAreaEntity mAreaModel);

    Page<MTbCityEntity> selectCity(MTbCityEntity  mCityModel);
}
