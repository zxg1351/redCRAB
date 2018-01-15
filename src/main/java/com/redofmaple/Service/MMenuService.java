package com.redofmaple.service;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MMMenuEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface MMenuService {

    ResultInfo selectMenu();


    Page<MMMenuEntity> selectPageMenu(Pageable pageable);
}
