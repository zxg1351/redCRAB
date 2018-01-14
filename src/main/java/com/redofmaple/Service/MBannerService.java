package com.redofmaple.Service;


import com.redofmaple.common.bean.ResultInfo;
import com.redofmaple.model.MBannersModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface MBannerService {

    //http://img2.3lian.com/2014/f6/173/d/51.jpg
    //http://www.hanhande.com/upload/151230/1283568_105451_1.jpg
   // http://pic.qiantucdn.com/58pic/27/06/74/12C58PICR2b_1024.jpg!/fw/780/watermark/url/L3dhdGVybWFyay12MS4zLnBuZw==/align/center
    //http://pic.qiantucdn.com/58pic/14/10/35/36N58PICq9g_1024.jpg!/fw/780/watermark/url/L3dhdGVybWFyay12MS4zLnBuZw==/align/center
    //查询所有(根据名字进行查询)
     ResultInfo selectAllBanner(String mBannerName);


     ResultInfo insertBanner(MBannersModel mBannerModel);


     Page<MBannersModel> selectPageBanner(Pageable pageable);


     ResultInfo findById(Integer mbannerId);


     ResultInfo editBanner(MBannersModel mBannerModel);


     ResultInfo deleteById(Integer mbannerId);

     Page<MBannersModel> selectBanner(MBannersModel mRoleModel);
}
