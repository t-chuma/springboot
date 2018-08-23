package com.maocl.springboot.mapper;

import com.maocl.springboot.config.mybatis.MyMapper;
import com.maocl.springboot.datasource.MultiDataSource;
import com.maocl.springboot.entity.EnvInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by maocl on 2018/8/14.
 */

@Mapper
@MultiDataSource.DataSource("ds1")
public interface EnvInfoMapper{

    EnvInfo getById(int id);
}
