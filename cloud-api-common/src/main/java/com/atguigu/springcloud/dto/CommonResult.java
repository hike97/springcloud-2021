package com.atguigu.springcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hike97 2month
 * @create 2021-01-25 0:51
 * @desc 通用返回体
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
	private Integer code;
	private String  message;
	private T       data;

	public CommonResult(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
