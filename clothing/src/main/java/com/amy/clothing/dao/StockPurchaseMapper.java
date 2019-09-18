package com.amy.clothing.dao;

import com.amy.clothing.pojo.StockPurchase;

public interface StockPurchaseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(StockPurchase record);

    int insertSelective(StockPurchase record);

    StockPurchase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StockPurchase record);

    int updateByPrimaryKey(StockPurchase record);
}