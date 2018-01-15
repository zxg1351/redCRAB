package com.redofmaple.repository;

import com.redofmaple.domain.MTbProvinceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
public interface MProvinceRepository extends JpaRepository<MTbProvinceEntity,Integer> ,JpaSpecificationExecutor{

    List<MTbProvinceEntity> findAllBy();

    List<MTbProvinceEntity> findAllByMProvinceName(String mProvinceName);

}
