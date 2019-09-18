package com.amy.clothing.service;

import com.amy.clothing.pojo.StockPurchase;

public interface StockPurchaseService {
    int deleteByPrimaryKey(Integer id);

    int insert(StockPurchase record);

    int insertSelective(StockPurchase record);

    StockPurchase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StockPurchase record);

    int updateByPrimaryKey(StockPurchase record);
}
