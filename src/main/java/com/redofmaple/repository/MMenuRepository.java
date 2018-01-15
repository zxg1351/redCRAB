package com.redofmaple.repository;

import com.redofmaple.domain.MMMenuEntity;
import com.redofmaple.domain.MTbCityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface MMenuRepository extends JpaRepository<MMMenuEntity,Integer>,JpaSpecificationExecutor {


    List<MTbCityEntity> findAllByMProvinceId(String provinceId);
}
