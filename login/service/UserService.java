package com.lhz.lhz_Spring_SSM01.login.service;

import com.lhz.lhz_Spring_SSM01.login.entity.User;

public interface UserService {
	//�û���¼
	User userLogin(String name,String pwd);
}
