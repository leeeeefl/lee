package com.lfl.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("custom_info")
public class CustomInfo {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
}
