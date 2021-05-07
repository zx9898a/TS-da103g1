package com.vue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vue.service.impl.ActivityServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/DA103G1")
public class ActivityController {
	
	@Autowired
	ActivityServiceImpl activityserviceimpl;
	
	@PostMapping(value = "/activityInfo")
	public String getWeb() {
		
		log.info("getActivityInfo{} " + activityserviceimpl.getActivityVo() );
		
		return activityserviceimpl.getActivityVo();
		
	}
}
