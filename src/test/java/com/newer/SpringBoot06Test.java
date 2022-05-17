package com.newer;

import com.newer.mapper.PermissionMapper;
import com.newer.mapper.RoleMapper;
import com.newer.mapper.UserMapper;
import com.newer.model.Role;
import com.newer.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Set;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBoot06Test {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Test
    public void test() throws SQLException {
        Set<Role> roles = roleMapper.selectByuid(1);
        for (Role role : roles) {
            System.out.println(role);
        }

    }
}
