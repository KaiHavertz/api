package com.api.entity;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@ApiModel("部门实体类")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	@ApiModelProperty("部门id")
	private Integer id;

	@ApiModelProperty("部门名称")
	private String name;// 部门名称

	@Override
	public String toString() {
		return JSONObject.wrap(this).toString();
	}
}
