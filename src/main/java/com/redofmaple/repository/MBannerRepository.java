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

    Page<MTbBannerEntity> findByDelFlag(String delFlag, Pageable pageable);

}
