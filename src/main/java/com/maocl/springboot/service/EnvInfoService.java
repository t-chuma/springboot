package com.maocl.springboot.service;

import com.maocl.springboot.entity.EnvInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by maocl on 2018/8/14.
 */
@Service
public class EnvInfoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<EnvInfo> getList(){
        String sql = "SELECT id,appId,groupId,groupName,env,updateTime FROM tds_envinfo";
        return (List<EnvInfo>) jdbcTemplate.query(sql, new RowMapper<EnvInfo>(){

            @Override
            public EnvInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                EnvInfo envInfo = new EnvInfo();
                envInfo.setId(rs.getInt("id"));
                envInfo.setAppId(rs.getString("appId"));
                envInfo.setGroupId(rs.getString("groupId"));
                envInfo.setGroupName(rs.getString("groupName"));
                envInfo.setEnv(rs.getString("env"));
                envInfo.setUpdateTime(rs.getString("updateTime"));
                return envInfo;
            }

        });
    }
}
