package com.sakura.service;

import com.sakura.entity.HelloWorldEntity;

import java.util.List;

public interface IHelloWorldService {
    List<HelloWorldEntity> dataGrid(HelloWorldEntity entity);
}
