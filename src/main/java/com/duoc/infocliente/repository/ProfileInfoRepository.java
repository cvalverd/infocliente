package com.duoc.infocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.infocliente.model.ProfileInfo;

public interface ProfileInfoRepository extends JpaRepository<ProfileInfo,Long>{
    
}
