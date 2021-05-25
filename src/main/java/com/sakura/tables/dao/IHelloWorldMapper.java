package com.sakura.tables.dao;

import com.sakura.tables.entity.HelloWorldEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
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