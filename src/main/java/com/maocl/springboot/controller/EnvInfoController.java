package com.maocl.springboot.controller;


import com.maocl.springboot.config.Shanhy;
import com.maocl.springboot.entity.EnvInfo;
import com.maocl.springboot.mapper.EnvInfoMapper;
import com.maocl.springboot.service.EnvInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by maocl on 2018/8/13.
 */
@RestController
@RequestMapping("/envInfo")
public class EnvInfoController {

    private static final Logger logger = LoggerFactory.getLogger(EnvInfoController.class);

//    @Resource(name="shanhyA")
//    private Shanhy shanhyA;
//
//    @Autowired
//    @Qualifier("shanhyB")
//    private Shanhy shanhyB;

    @Autowired
    private EnvInfoService envInfoService;

    @Autowired
    private EnvInfoMapper envInfoMapper;

    @RequestMapping("/list")
    public List<EnvInfo> getList() {
        logger.info("get env info from envInfoService");
        return envInfoService.getList();
    }

    @RequestMapping("/listById")
    public EnvInfo listById() {
        logger.info("get env info from envInfoService By id");
//        shanhyA.display();
//        shanhyB.display();
        return envInfoMapper.getById(1);
    }
}
