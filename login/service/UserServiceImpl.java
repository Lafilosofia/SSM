package com.lhz.lhz_Spring_SSM01.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhz.lhz_Spring_SSM01.login.entity.User;
import com.lhz.lhz_Spring_SSM01.login.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {
	//ע��־ò�
	@Autowired
	private UserMapper mapper;
	//�û���¼
	@Override
	public User userLogin(String name, String pwd) {
		//�����û����ֲ�ѯ�Ƿ���ڸ��û�
		User user = mapper.findUserByName(name);
		if (user == null) {
			throw new nameNotExistException("���û�������!");
		}
		//��ȡ���û������ݿ��е�����
		String dbpwd = user.getUserPwd();
		//�ж��û��������������ݿ��е������Ƿ�һ��
		if (!dbpwd.equals(pwd)) {
			throw new UserPwdNotMatchedException("�û��������");
		}
		//��½�ɹ�
		return user;
	}

}
