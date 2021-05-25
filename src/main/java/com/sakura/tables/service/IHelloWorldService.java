package com.sakura.tables.service;

import com.sakura.tables.entity.HelloWorldEntity;

import java.util.List;

public interface IHelloWorldService {
    List<HelloWorldEntity> dataGrid(HelloWorldEntity entity);
}
