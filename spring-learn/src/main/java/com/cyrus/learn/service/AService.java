package com.cyrus.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: cyrus
 * @Date: 2022/10/22 20:50
 * @Description:
 */
@Service
public class AService {

	@Autowired
	private BService bService;


	public BService getbService() {
		return bService;
	}

	public void setbService(BService bService) {
		this.bService = bService;
	}

}
