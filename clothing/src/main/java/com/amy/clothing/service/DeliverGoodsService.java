package com.amy.clothing.service;

import com.amy.clothing.pojo.DeliverGoods;


public interface DeliverGoodsService {
    int deleteByPrimaryKey(Integer id);

    int insert(DeliverGoods record);

    int insertSelective(DeliverGoods record);

    DeliverGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeliverGoods record);

    int updateByPrimaryKey(DeliverGoods record);
}
