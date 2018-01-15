package com.redofmaple.service.impl;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.domain.MMMenuEntity;
import com.redofmaple.repository.MMenuRepository;
import com.redofmaple.service.MMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class MMenuServiceImpl implements MMenuService {
    private static final Logger logger = LoggerFactory.getLogger(MMenuServiceImpl.class);
    @Autowired
    private MMenuRepository mMenuRepository;

    @Override
    public ResultInfo selectMenu() {
        ResultInfo resultInfo = new ResultInfo();

        List<MMMenuEntity> mMenuModelList = mMenuRepository.findAll();
        if (!CollectionUtils.isEmpty(mMenuModelList)){

            resultInfo.setAppData(mMenuModelList);
            logger.debug("菜单列表信息显示");

        }else {
            logger.debug("暂无菜单列表信息显示");
        }


        return resultInfo;
    }

    @Override
    public Page<MMMenuEntity> selectPageMenu(Pageable pageable) {

        Page<MMMenuEntity> modelPage = mMenuRepository.findAll(pageable);

        return modelPage;
    }
}
