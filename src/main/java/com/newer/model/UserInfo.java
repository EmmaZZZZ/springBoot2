package com.newer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("sys_user")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String usercode;
    private String username;
    private String password;
    private boolean enabled; // 是否禁用
    private boolean locked; // 是否锁定
}
