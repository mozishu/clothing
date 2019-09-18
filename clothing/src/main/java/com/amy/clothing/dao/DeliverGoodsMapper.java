package com.amy.clothing.dao;

import com.amy.clothing.pojo.DeliverGoods;

public interface DeliverGoodsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DeliverGoods record);

    int insertSelective(DeliverGoods record);

    DeliverGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeliverGoods record);

    int updateByPrimaryKey(DeliverGoods record);
}