package com.dlm.jctx.bam_basemanagement.service;

import java.util.List;

import com.dlm.jctx.bam_basemanagement.vo.UserInfoExtends;
import com.dlm.jctx.pojo.UserInfo;


public interface UserInfoService {
	List<UserInfo> list();
	void add(UserInfo record);
	void update(UserInfo record);
	void delete(int id);
	UserInfo get(int id);
	
	//登陆成功后返回家庭及他的家庭成员数据
	UserInfoExtends login(UserInfo record);
	//根据用户名查唯一的用户
	UserInfo findUserInfoByUsername(String username);
}
