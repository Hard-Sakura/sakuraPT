package com.tables.dao;

import com.tables.entity.HelloWorldEntity;

import java.util.List;

public interface IHelloWorldMapper {
    int deleteByPrimaryKey(String id);

    int insert(HelloWorldEntity record);

    /**
     * @desc:  查询
     * @auther: Sakura
     * @date:  10:38
     */
    List<HelloWorldEntity> selectByPrimaryKey(HelloWorldEntity record);

    int updateByPrimaryKeySelective(HelloWorldEntity record);
}