package com.lhz.lhz_Spring_SSM01.login.mapper;

import com.lhz.lhz_Spring_SSM01.login.entity.User;

/**
 * ӳ����
 * @author HP
 *
 */
public interface UserMapper {
	//�����û�����ѯ�û�����
	User findUserByName(String name);
}
