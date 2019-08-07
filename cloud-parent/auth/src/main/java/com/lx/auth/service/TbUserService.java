package com.lx.auth.service;

import com.lx.auth.entity.TbUser;

public interface TbUserService{


    TbUser getByUserName(String userName);

}
