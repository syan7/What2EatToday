package com.syan.what2eattoday.entity;



import lombok.Data;
import javax.persistence.Column;

/**
 * @author : syan
 * @date : 2024/9/15
 * @comment : 用户表
 */


@Data
public class User {

	/**
	 * 主键
	 */
  	@Column(name = "id")
	private java.lang.Integer id;


	/**
	 * 用户名
	 */
  	@Column(name = "user_name")
	private String userName;


	/**
	 * 密码
	 */
  	@Column(name = "password")
	private String password;


	/**
	 * null
	 */
  	@Column(name = "email")
	private String email;


	/**
	 * 管理权限(0: 管理员, 1: 普通用户)
	 */
  	@Column(name = "is_staff")
	private java.lang.Integer isStaff;


	/**
	 * 是否可用(0: 不可用, 1: 可用)
	 */
  	@Column(name = "is_active")
	private java.lang.Integer isActive;



}
