package com.amy.clothing.service.impl;

import com.amy.clothing.dao.OrderDetailMapper;
import com.amy.clothing.pojo.OrderDetail;
import com.amy.clothing.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return orderDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderDetail record) {
        return orderDetailMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderDetail record) {
        return orderDetailMapper.insertSelective(record);
    }

    @Override
    public OrderDetail selectByPrimaryKey(Integer id) {
        return orderDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKey(record);
    }
}
