package com.sakura.tables.controller;

import com.sakura.tables.entity.HelloWorldEntity;
import com.sakura.tables.service.impl.HelloWorldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @desc: 测试controller
 * @auther: Sakura
 * @date:  10:51
 */
@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {

    @Autowired
    private HelloWorldServiceImpl helloWorldService;

    /**
     * @desc: 查询
     * @auther: Sakura
     * @date:  10:45
     */
    @PostMapping("dataGrid")
    public PageInfo<HelloWorldEntity> dataGrid(@RequestBody HelloWorldEntity entity){
        List<HelloWorldEntity> list = helloWorldService.dataGrid(entity);
        PageInfo<HelloWorldEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
