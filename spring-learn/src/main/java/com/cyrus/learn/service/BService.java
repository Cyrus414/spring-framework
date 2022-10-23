package com.cyrus.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: cyrus
 * @Date: 2022/10/22 20:50
 * @Description:
 */
@Service
public class BService {

	@Autowired
	private AService aService;

	public AService getaService() {
		return aService;
	}

	public void setaService(AService aService) {
		this.aService = aService;
	}
}
