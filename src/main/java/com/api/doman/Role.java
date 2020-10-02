package com.api.doman;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户权限 json
 * @author JNR
 * @date 2020年10月1日
 * @time 下午12:30:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	   private String[] roles;
	   private String name;
	   private String avatar;
	   private String introduction;

}
