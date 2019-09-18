package com.amy.clothing.service.impl;

import com.amy.clothing.dao.StockPurchaseMapper;
import com.amy.clothing.pojo.StockPurchase;
import com.amy.clothing.service.StockPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StockPurchaseServiceImpl implements StockPurchaseService {
    @Autowired
    private StockPurchaseMapper stockPurchaseMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return stockPurchaseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StockPurchase record) {
        return stockPurchaseMapper.insert(record);
    }

    @Override
    public int insertSelective(StockPurchase record) {
        return stockPurchaseMapper.insertSelective(record);
    }

    @Override
    public StockPurchase selectByPrimaryKey(Integer id) {
        return stockPurchaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockPurchase record) {
        return stockPurchaseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StockPurchase record) {
        return stockPurchaseMapper.updateByPrimaryKey(record);
    }
}
