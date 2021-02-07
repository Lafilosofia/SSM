package com.lhz.lhz_Spring_SSM01.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import com.lhz.lhz_Spring_SSM01.login.service.UserPwdNotMatchedException;
import com.lhz.lhz_Spring_SSM01.login.service.nameNotExistException;


public abstract class HandlerExceptionMessage{
	//�����쳣��Ϣ
		@ExceptionHandler
		public String exceptionHandler(Exception exception ,HttpServletRequest request){
			if (exception instanceof UserPwdNotMatchedException ) {
				//���쳣��Ϣ  ��ȡ�쳣��Ϣ
				request.setAttribute("message",exception.getMessage());
				return "login";
			}else if(exception instanceof nameNotExistException){
				//���쳣��Ϣ  ��ȡ�쳣��Ϣ
				request.setAttribute("message2", exception.getMessage());
				return "login";
			}
			return "";
		}
}
