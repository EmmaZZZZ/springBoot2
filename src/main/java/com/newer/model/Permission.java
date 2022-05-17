package com.newer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("sys_permission")
public class Permission implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId("id")
    private Long id;
    private String name;
    private String type;
    private String url;
    private String percode; // 权限代码：user:query
    private Long parentid;
    private String parentids;
    private String sortstring;
    private Boolean available;
}
