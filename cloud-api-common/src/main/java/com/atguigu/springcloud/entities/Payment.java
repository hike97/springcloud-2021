package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hike97 2month
 * @create 2021-01-25 0:48
 * @desc 主实体
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
	private Long id;
	private String serial;
}
