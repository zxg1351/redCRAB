package com.redofmaple.repository;

import com.redofmaple.domain.MTbBannerEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/18.
 */
public interface MBannerRepository extends JpaRepository<MTbBannerEntity, Integer>, JpaSpecificationExecutor {


    List<MTbBannerEntity> findAll();

    List<MTbBannerEntity> findByMBannerNameLike(String mBannerName);

    @Modifying
    @Transactional
    @Query("update MBannerModel mb set mb.updateUser =:updateUser,mb.updateTime= :updateTime," +
            "mb.mBannerName=:mBannerName,mb.mBannerUrl=:mBannerUrl,mb.mBannerType=:mBannerType where mb.id= :id")
    int editBanner(@Param("updateUser") Integer updateUser, @Param("updateTime") Date updateTime, @Param("mBannerName") String mBannerName,
                   @Param("mBannerUrl") String mBannerUrl,
                   @Param("mBannerType") String mBannerType, @Param("id") Integer id);


    @Modifying
    @Transactional
    @Query("update MBannerModel mb set mb.updateUser =:updateUser,mb.updateTime=:updateTime,mb.delFlag=:delFlag  where mb.id= :id")
    int deleteBannerById(@Param("updateUser") Integer updateUser, @Param("updateTime") Date updateTime, @Param("delFlag") String delFlag, @Param("id") Integer id);


    Page<MTbBannerEntity> findByDelFlag(String delFlag, Pageable pageable);

}
