/**
  * @filename UserService.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.hua.bean.UserBean;

 /**
 * @type UserService
 * @description 
 * @author qianye.zheng
 */
public interface UserService extends Remote
{
	
	/**
	 * 
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
	public UserBean get(final String username, final String password) throws RemoteException;
	//public UserBean get(final String username, final String password);
}
