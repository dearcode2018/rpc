/**
 * RMIServer.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * RMIServer
 * 描述: 
 * @author  qye.zheng
 */
public final class RMIServer
{

	/**
	 * 构造方法
	 * 描述: 
	 * @author  qye.zheng
	 */
	private RMIServer()
	{
	}

	/**
	 * 
	 * @description 发布服务
	 * @param address
	 * @param port
	 * @param target
	 * @author qianye.zheng
	 */
	public static final void publish(final String address, 
			final int port, final Remote target)
	{
		try
		{
			// 注册通讯端口
			//加上此程序，就可以不要在控制台上开启RMI的注册程序
			LocateRegistry.createRegistry(port);
			// 注册通讯路径
			Naming.rebind(address, target);
		} catch (RemoteException e)
		{
			e.printStackTrace();
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
	}
	
}
