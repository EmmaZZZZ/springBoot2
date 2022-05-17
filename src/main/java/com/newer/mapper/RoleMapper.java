package com.newer.mapper;

import com.newer.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface RoleMapper {
    @Select("select * from sys_role r inner join sys_user u on r.id=u.id where u.id=#{id}")
    Set<Role> selectByuid(@Param("id")Integer id);
}
