package com.tables.service;

import com.tables.entity.HelloWorldEntity;

import java.util.List;

public interface IHelloWorldService {
    List<HelloWorldEntity> dataGrid(HelloWorldEntity entity);
}
