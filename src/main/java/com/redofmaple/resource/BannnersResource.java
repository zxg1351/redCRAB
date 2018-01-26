package com.redofmaple.resource;

import com.redofmaple.model.MBannersModel;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 轮播图
 */
@RestController
@RequestMapping(value = "/mBanners")
public class BannnersResource {


    @PostMapping
    @RequestMapping(value = "/searchBanners")
    public MBannersModel searchBanners(){

        MBannersModel mBannersModel = new MBannersModel();
        return mBannersModel;
    }



}
