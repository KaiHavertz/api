package com.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Department;
import com.api.utils.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api("部门接口控制器")
@RestController
@RequestMapping("department")
public class DepartmentController {

	@ApiOperation("获取部门列表信息")
	@RequestMapping(value = "departmentList", method = RequestMethod.GET)
	@ApiImplicitParam(name = "department", value = "用户登录表单", required = true, dataType = "Department")
	public ResponseResult<List<Department>> departmentList( Department department) {
		ResponseResult<List<Department>> rr = new ResponseResult<List<Department>>();
		List<Department> departmentList = new ArrayList<Department>();
		Department depart = null;
		for (int i = 1; i < 10; i++) {
			depart = new Department();
			depart.setId(i);
			depart.setName(i + " 部门");
			departmentList.add(depart);
		}
		rr.setData(departmentList);
		rr.setMsg("成功");
		rr.setCode(200);
		return rr;
	}
}
