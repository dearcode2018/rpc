/**
  * @filename UserServiceImpl.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.hua.bean.UserBean;
import com.hua.constant.RMIConstant;
import com.hua.service.UserService;
import com.hua.util.DateTimeUtil;

 /**
 * @type UserServiceImpl
 * @description 
 * @author qianye.zheng
 */
//@SuppressWarnings({"serial"})
public class UserServiceImpl extends UnicastRemoteObject implements
		UserService
{

	private static final long serialVersionUID = 1L;

	/**
	 * @description 构造方法
	 * @throws RemoteException
	 * @author qianye.zheng
	 */
	public UserServiceImpl() throws RemoteException
	{
		//super(RMIConstant.port);
		super();
	}

	/**
	 * @description 
	 * @param username
	 * @param password
	 * @return
	 * @author qianye.zheng
	 */
	/*
	 * 注意，RMI方法一定要抛出 RemoteException，不然无法正常
	 * 初始化服务对象，就会抛出如下异常:
	 * java.rmi.server.ExportException: remote object implements 
	 * illegal remote interface; nested exception is: 
	 */
	@Override
	public UserBean get(final String username, final String password) throws RemoteException
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
