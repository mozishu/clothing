package com.amy.clothing.service;

import com.amy.clothing.pojo.RawMaterial;

public interface RawMaterialService {
    int deleteByPrimaryKey(Integer id);

    int insert(RawMaterial record);

    int insertSelective(RawMaterial record);

    RawMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RawMaterial record);

    int updateByPrimaryKey(RawMaterial record);
}
