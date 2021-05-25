package com.sakura.service.impl;

import com.github.pagehelper.PageHelper;
import com.sakura.dao.IHelloWorldMapper;
import com.sakura.entity.HelloWorldEntity;
import com.sakura.service.IHelloWorldService;
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
