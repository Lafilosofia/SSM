package com.lhz.lhz_Spring_SSM01.login.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lhz.lhz_Spring_SSM01.login.service.UserService;


/**
 * ���Ʋ�
 * @author HP
 *
 */

@Controller
@RequestMapping("user")
public class UserController extends HandlerExceptionMessage{
	//ע��ҵ���
	@Autowired
	private UserService service;
	
	
	
	//��¼ҳ��
	@RequestMapping("login.do")
	public String loginHtml(){
		return "login";
	}
	
	@RequestMapping("toUserlogin.do")
	public String toUserLogin(String userName,@RequestParam("userPassword")String pwd){
		service.userLogin(userName, pwd);
		return "success";
	}
}
