package com.newer.mapper;

import com.newer.model.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface PermissionMapper {
    @Select("select distinct p.* from sys_user u left join sys_user_role ur on u.id=ur.uid \n" +
            "left join sys_role r on ur.rid = r.id \n" +
            "left join sys_role_permission rp on r.id = rp.rid\n" +
            "left join sys_permission p on p.id = rp.pid\n" +
            "where u.id = #{id} ")
    Set<Permission> selectByid(@Param("id")Integer id);
}
