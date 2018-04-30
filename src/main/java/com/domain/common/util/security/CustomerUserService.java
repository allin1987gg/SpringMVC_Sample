package com.domain.common.util.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

public class CustomerUserService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerUserService.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User detail = null;
        //判断username是否为null
        if(username != null){
            ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            authorities.add(new SimpleGrantedAuthority("ROLE_MODELER"));
            authorities.add(new SimpleGrantedAuthority("ROLE_ANALYST"));
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

            //可以加入其他判断逻辑，以及根据username获取密码的方法。
            //由于是Demo，就直接将密码写死为"TEST"，权限直接设置成"ROLE_ADMIN"、"ROLE_MODELER"和"ROLE_ANALYST"
            detail = new User(username, "TEST", authorities);
        }

        return detail;
    }
}