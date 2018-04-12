/**
  * @filename ServiceHandlerImpl.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.handler.impl;

import com.hua.handler.ServiceHandler;

 /**
 * @type ServiceHandlerImpl
 * @description 
 * @author qianye.zheng
 */
public final class ServiceHandlerImpl implements ServiceHandler
{

	/**
	 * @description 
	 * @param name
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public String sayHello(final String name)
	{
		return "hello, " + name;
	}

}
