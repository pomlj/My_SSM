package com.kangzhan.dao;

import com.kangzhan.entiy.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	/**
	 * 查询用户表记录数
	 * @return
	 */
	public int count();

	public int add(User user);

	public User login(@Param("username") String username, @Param("password")String password);
	
}
