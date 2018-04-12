/**
  * @filename UserSpringService.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.service;

import com.hua.bean.UserBean;

 /**
 * @type UserSpringService
 * @description 
 * @author qianye.zheng
 */
public interface UserSpringService extends CoreService
{
	
	/**
	 * 
	 * @description 
	 * @param username
	 * @param password
	 * @return
	 * @author qianye.zheng
	 */
	public UserBean get(final String username, final String password);
	//public UserBean get(final String username, final String password);
}
