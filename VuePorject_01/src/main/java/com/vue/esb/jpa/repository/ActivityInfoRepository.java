package com.vue.esb.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vue.esb.entity.ActivityInfoEntity;


@Repository
public interface ActivityInfoRepository extends JpaRepository<ActivityInfoEntity, String> {

}