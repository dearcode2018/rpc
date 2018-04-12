/**
 * RMIClient.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMIClient
 * 描述: 
 * @author  qye.zheng
 */
public final class RMIClient
{

	/**
	 * 构造方法
	 * 描述: 
	 * @author  qye.zheng
	 */
	private RMIClient()
	{
	}

	/**
	 * 
	 * @description 
	 * @param address
	 * @return
	 * @author qianye.zheng
	 */
	@SuppressWarnings({"unchecked"})
	public static final <T extends Remote> T lookup(final String address)
	{
		T t = null;
		try
		{
			t = (T) Naming.lookup(address);
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
		} catch (RemoteException e)
		{
			e.printStackTrace();
		} catch (NotBoundException e)
		{
			e.printStackTrace();
		}
		
		return t;
	}
	
}
