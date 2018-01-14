package com.redofmaple.repository;

import com.redofmaple.domain.MTbAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface MAreaRepository extends JpaRepository<MTbAreaEntity, Integer>, JpaSpecificationExecutor {


    List<MTbAreaEntity> findAllByMCityId(String mCityId);

}
