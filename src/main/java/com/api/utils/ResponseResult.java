package com.api.utils;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("返回数据统一模型类")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {
	/**
	 * Code：状态码，200正常 Msg：文本信息 Data：返回数据
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("状态码，200正常")
	private Integer code;
	@ApiModelProperty(" 文本信息 ")
	private String msg;
	@ApiModelProperty("返回 的 json 数据")
	private T data;
	
}
