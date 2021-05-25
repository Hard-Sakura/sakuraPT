package com.sakura.controller;

import com.sakura.entity.HelloWorldEntity;
import com.sakura.service.impl.HelloWorldServiceImpl;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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
        try {
            List<HelloWorldEntity> list = helloWorldService.dataGrid(entity);
            PageInfo<HelloWorldEntity> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }catch (Exception e){
            log.error("出错啦!",e);
            return null;
        }
    }
}
