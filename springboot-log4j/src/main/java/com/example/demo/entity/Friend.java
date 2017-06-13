package com.example.demo.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class Friend {
	
    private Integer fid;

    private Integer fType;

   
    private String fname;

    @Range(min=18,max=90,message="年龄不符合系统规范")//验证年龄是否正确
    private Integer age;
    
    private String ftel;

    @NotBlank(message="sex不能为空")//在使用@NotBlank等注解时，一定要和@valid一起使用[@valid放在controller中方法上进行数据验证]，不然@NotBlank不起作用
    private String sex;

	@Override
	public String toString() {
		return "Friend [fid=" + fid + ", fType=" + fType + ", fname=" + fname + ", ftel=" + ftel + ", sex=" + sex + "]";
	}

    
   
}