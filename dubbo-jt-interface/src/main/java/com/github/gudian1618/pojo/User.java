package com.github.gudian1618.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;
//对象必须序列化!!!!!
@Data
@Accessors(chain=true)
@TableName
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@TableId(type=IdType.AUTO)
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
}