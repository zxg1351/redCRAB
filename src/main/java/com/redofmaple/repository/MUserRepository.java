package com.redofmaple.repository;

import com.redofmaple.domain.MTbUserEntity;
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

public interface MUserRepository extends JpaRepository<MTbUserEntity, Integer>, JpaSpecificationExecutor {


    List<MTbUserEntity> findByMUserAccountOrMUserTel(String mUserAccount, String mUserTel);

    List<MTbUserEntity> findByMUserAccountAndMUserPassword(String mUserAccount, String mUserPassword);


    Page<MTbUserEntity> findByDelFlag(String delFlag, Pageable pageable);
}
