package com.lx.auth.config;

import com.lx.auth.dao.TbUserMapper;
import com.lx.auth.entity.TbPermission;
import com.lx.auth.entity.TbUser;
import com.lx.auth.service.TbPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserMapper tbUserMapper;
    @Autowired
    private TbPermissionService tbPermissionService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        TbUser tbUser = tbUserMapper.getByUserName(s);
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
        if (null != tbUser){
            List<TbPermission> tbPermissionList = tbPermissionService.selectByUserId(tbUser.getId());
            if (!CollectionUtils.isEmpty(tbPermissionList)){
                tbPermissionList.forEach(tbPermission -> {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorityList.add(grantedAuthority);
                });
            }
        }
        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorityList);
    }
}
