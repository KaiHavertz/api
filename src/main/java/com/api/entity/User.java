package com.api.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户信息实体类")
@Data
public class User {
	private Integer userId;
	@ApiModelProperty("用户名")
	private String userName;
	@ApiModelProperty("性别，1男2女")
	private Integer userSex;// :性别，1男2女,
	private Integer userAge;
	private Date userBirthday;
	@ApiModelProperty("部门编号")
	private Integer userDepartment;// ：部门编号,
	@ApiModelProperty("部门名称")
	private String Name;// :部门名称,
	@ApiModelProperty("乐观锁")
	private Integer Version;// :乐观锁

}
