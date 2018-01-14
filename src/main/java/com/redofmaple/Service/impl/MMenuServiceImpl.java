package com.redofmaple.Service.impl;

import com.zxg.maplehourse.bean.ResultInfo;
import com.zxg.maplehourse.model.MMenuModel;
import com.zxg.maplehourse.repository.MMenuRepository;
import com.zxg.maplehourse.service.MMenuService;
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

        List<MMenuModel> mMenuModelList = mMenuRepository.findAll();
        if (!CollectionUtils.isEmpty(mMenuModelList)){

            resultInfo.setAppData(mMenuModelList);
            logger.debug("菜单列表信息显示");

        }else {
            logger.debug("暂无菜单列表信息显示");
        }


        return resultInfo;
    }

    @Override
    public Page<MMenuModel> selectPageMenu(Pageable pageable) {

        Page<MMenuModel> modelPage = mMenuRepository.findAll(pageable);

        return modelPage;
    }
}
