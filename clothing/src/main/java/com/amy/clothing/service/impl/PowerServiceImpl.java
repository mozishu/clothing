package com.amy.clothing.service.impl;

import com.amy.clothing.dao.PowerMapper;
import com.amy.clothing.pojo.Power;
import com.amy.clothing.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PowerServiceImpl implements PowerService {
    @Autowired
    private PowerMapper powerMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return powerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Power record) {
        return powerMapper.insert(record);
    }

    @Override
    public int insertSelective(Power record) {
        return powerMapper.insertSelective(record);
    }

    @Override
    public Power selectByPrimaryKey(Integer id) {
        return powerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Power record) {
        return powerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Power record) {
        return powerMapper.updateByPrimaryKey(record);
    }
}
