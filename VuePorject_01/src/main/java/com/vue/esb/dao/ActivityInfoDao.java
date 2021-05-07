package com.vue.esb.dao;


import org.springframework.stereotype.Repository;

import com.vue.esb.entity.ActivityInfoEntity;
import com.vue.esb.jpa.repository.ActivityInfoRepository;
@Repository
public class ActivityInfoDao {
	
	private ActivityInfoRepository activityinforepository;
	
	public ActivityInfoDao(ActivityInfoRepository activityinforepository) {
		super();
		this.activityinforepository = activityinforepository;
	}
	
	public ActivityInfoEntity getActOne() {
		
		ActivityInfoEntity entity = activityinforepository.findAll().get(0);
		return entity;
	}
}
