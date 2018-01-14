package com.redofmaple.Service;

import com.zxg.maplehourse.bean.ResultInfo;
import com.zxg.maplehourse.model.MMenuModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface MMenuService {

    ResultInfo selectMenu();


    Page<MMenuModel> selectPageMenu(Pageable pageable);
}
