package com.amy.clothing.service.impl;

import com.amy.clothing.dao.RawMaterialMapper;
import com.amy.clothing.pojo.RawMaterial;
import com.amy.clothing.service.RawMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RawMaterialServiceImpl implements RawMaterialService {
    @Autowired
    private RawMaterialMapper rawMaterialMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return rawMaterialMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RawMaterial record) {
        return rawMaterialMapper.insert(record);
    }

    @Override
    public int insertSelective(RawMaterial record) {
        return rawMaterialMapper.insertSelective(record);
    }

    @Override
    public RawMaterial selectByPrimaryKey(Integer id) {
        return rawMaterialMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RawMaterial record) {
        return rawMaterialMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RawMaterial record) {
        return rawMaterialMapper.updateByPrimaryKey(record);
    }
}
