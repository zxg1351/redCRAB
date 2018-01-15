package com.redofmaple.repository;

import com.redofmaple.domain.MMRoleEntity;
import com.redofmaple.domain.MTbCityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface MRoleRepository extends JpaRepository<MMRoleEntity,Integer>,JpaSpecificationExecutor {


    List<MMRoleEntity> findAllByMProvinceId(String provinceId);
}
