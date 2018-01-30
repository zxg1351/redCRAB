package com.redofmaple.resource;

import com.redofmaple.model.MBannersModel;
import com.redofmaple.service.MBannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 轮播图
 */
@RestController
@RequestMapping(value = "/mBanners")
@Api(value = "轮播图管理")
public class BannnersResource {


    @Autowired
    private MBannerService mBannerService;

    @PostMapping
    @RequestMapping(value = "/searchBanners")
    @ApiOperation(value = "查询轮播图列表")
    public Page<MBannersModel> searchBanners(@RequestBody MBannersModel mBannersModel, @PageableDefault Pageable pageable){

        Page<MBannersModel> mBannersModelPage =mBannerService.selectAllBannersList(mBannersModel,pageable);
        return mBannersModelPage;
    }


}
