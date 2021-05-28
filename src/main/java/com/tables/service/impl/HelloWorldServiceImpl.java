package com.tables.service.impl;

import com.github.pagehelper.PageHelper;
import com.tables.dao.IHelloWorldMapper;
import com.tables.entity.HelloWorldEntity;
import com.tables.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class HelloWorldServiceImpl implements IHelloWorldService {

    @Autowired
    private IHelloWorldMapper helloWorldMapper;

    @Override
    public List<HelloWorldEntity> dataGrid(HelloWorldEntity entity){
        PageHelper.startPage(entity.getPageIndex(), entity.getPageSize());
        List<HelloWorldEntity> list = helloWorldMapper.selectByPrimaryKey(entity);
        return list;
    }

}
