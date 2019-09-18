package com.amy.clothing.service.impl;

import com.amy.clothing.dao.DeliverGoodsMapper;
import com.amy.clothing.pojo.DeliverGoods;
import com.amy.clothing.service.DeliverGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeliverGoodsServiceImpl implements DeliverGoodsService {
    @Autowired
    private DeliverGoodsMapper deliverGoodsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return deliverGoodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DeliverGoods record) {
        return deliverGoodsMapper.insert(record);
    }

    @Override
    public int insertSelective(DeliverGoods record) {
        return deliverGoodsMapper.insertSelective(record);
    }

    @Override
    public DeliverGoods selectByPrimaryKey(Integer id) {
        return deliverGoodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DeliverGoods record) {
        return deliverGoodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DeliverGoods record) {
        return deliverGoodsMapper.updateByPrimaryKey(record);
    }
}
