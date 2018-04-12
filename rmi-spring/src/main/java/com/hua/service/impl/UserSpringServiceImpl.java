/**
  * @filename UserSpringServiceImpl.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service.impl;

import java.io.Serializable;

import com.hua.bean.UserBean;
import com.hua.service.UserSpringService;
import com.hua.util.DateTimeUtil;

 /**
 * @type UserSpringServiceImpl
 * @description 
 * @author qianye.zheng
 */
@SuppressWarnings({"serial"})
public class UserSpringServiceImpl extends CoreServiceImpl implements
		UserSpringService, Serializable
{

	/**
	 * @description 构造方法
	 * @author qianye.zheng
	 */
	public UserSpringServiceImpl()
	{
	}

	/**
	 * @description 
	 * @param username
	 * @param password
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public UserBean get(final String username, final String password)
	{
		UserBean user = new UserBean();
		user.setId("20150628");
		user.setUsername(username);
		user.setNickname("少年张三丰");
		user.setPassword(password);
		user.setValid(false);
		user.setLastLoginTime(DateTimeUtil.getTimestamp());
		user.setLastLoginIp("192.168.5.66");
		
		return user;
	}

}
