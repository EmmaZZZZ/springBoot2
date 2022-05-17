package com.newer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.newer.model.UserInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper extends BaseMapper<UserInfo> {
    @Select("select * from sys_user u where usercode=#{usercode}")
    UserInfo selectByName(@Param("usercode") String usercode);
}
