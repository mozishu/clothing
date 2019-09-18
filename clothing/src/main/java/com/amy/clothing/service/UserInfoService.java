package com.amy.clothing.service;

import com.amy.clothing.pojo.UserInfo;

public interface UserInfoService {
    int deleteByPrimaryKey(Integer id);


    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
