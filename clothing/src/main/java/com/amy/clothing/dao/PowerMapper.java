package com.amy.clothing.dao;

import com.amy.clothing.pojo.Power;

public interface PowerMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}