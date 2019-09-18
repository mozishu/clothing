package com.amy.clothing.service;

import com.amy.clothing.pojo.UserRole;

public interface UserRoleService {
    int deleteByPrimaryKey(Integer id);


    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}
