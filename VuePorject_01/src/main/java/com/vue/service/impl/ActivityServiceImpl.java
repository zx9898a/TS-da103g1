package com.vue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vue.esb.dao.ActivityInfoDao;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ActivityServiceImpl {
	
	@Autowired
	ActivityInfoDao activityInfoDao;
	
	public static final Gson GSON = new GsonBuilder().create();

	public String getActivityVo() {
		
		log.info("=====================get ActivityVO =======================");
		
		return GSON.toJson(activityInfoDao.getActOne());
	} 
	
}
