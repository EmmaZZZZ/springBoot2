package com.newer.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("sys_role")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;
    @TableField("role_code")
    private String roleCode;
    @TableField("role_name")
    private String roleName;
    private Boolean available;
}