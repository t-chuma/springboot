package com.maocl.springboot.mapper;

import com.maocl.springboot.config.mybatis.MyMapper;
import com.maocl.springboot.entity.EnvInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by maocl on 2018/8/14.
 */

@Mapper
public interface EnvInfoMapper{

    EnvInfo getById(int id);
}
