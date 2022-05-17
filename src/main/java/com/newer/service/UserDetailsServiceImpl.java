package com.newer.service;

import com.newer.mapper.PermissionMapper;
import com.newer.mapper.RoleMapper;
import com.newer.mapper.UserMapper;
import com.newer.model.Permission;
import com.newer.model.Role;
import com.newer.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
@Autowired
private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserInfo userInfo = userMapper.selectByName(username);
        System.out.println("usernameusername"+username);
        if(userInfo!=null){
        //根据用户id查找角色
            Set<GrantedAuthority> authorities=new HashSet<>();
        Set<Role> roles = roleMapper.selectByuid(userInfo.getId());
            for (Role role : roles) {
                authorities.add(new SimpleGrantedAuthority(role.getRoleCode()));
            }
            Set<Permission> permissionMappers = permissionMapper.selectByid(userInfo.getId());
            for (Permission mapper : permissionMappers) {
                authorities.add(new SimpleGrantedAuthority(mapper.getPercode()));
            }
            return new User(username,userInfo.getPassword(),authorities);
        }
        throw new UsernameNotFoundException("用户不存在");
    }
}
