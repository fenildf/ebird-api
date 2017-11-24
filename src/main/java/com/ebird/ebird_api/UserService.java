package com.ebird.ebird_api;

import java.util.List;

import com.ebird.ebird_entity.entity.BookEntity;
import com.ebird.ebird_entity.entity.UserEntity;
import com.ebird.ebird_entity.entity.UserExerciseDetailEntity;
import com.smartframe.entity.UserCur;

/**
 * 用户模块
 * @author Administrator
 *
 */
public interface UserService {
	
	/**
	 * 用户登录，根据用户名密码查询用户
	 * @param userName
	 * @param password
	 * @return
	 */
	public UserCur findUserLogin(String userName ,String password);
	
	/**
	 * 保存用户信息
	 * @param entity
	 */
	public void savaUser(UserEntity entity);
	
	/**
	 * 编辑用户信息
	 * @param entity
	 */
	public void editUser(UserEntity entity);
	
	/**
	 * 根据用户Id，查询用户信息
	 * @param userId
	 * @return
	 */
	public UserEntity getUserById(Integer userId);
	
	
	/**
	 * 更新用户最好登录时间
	 * @param entity
	 */
	public void updateLasterLoginTime(UserCur entity);
	
	
	public List<UserExerciseDetailEntity> findUserExerciseDetailById(Integer userId);
	
	
	
	public List<BookEntity> findExerciseById(Integer userId);
	
	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	public List<UserEntity>  getUserByName(String username);
	
	
	/**
	 * 更新用户密码
	 * @param userId
	 * @param password
	 */
	public void updatePassword(Integer userId ,String password);

}
