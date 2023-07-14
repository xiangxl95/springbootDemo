package com.example.demo.dao.mapper;

import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * @author xiangxl
 * @date 2021/12/23 13:49
 * @description:
 */
public interface UserInfoMapper {
    /**
     * 插入人员信息
     * @param map
     * @return
     */
    int insertUserInfo(Map map);

    /**
     * 查询人员信息
     * @return
     */
    @MapKey("id")
    List<Map> queryUserInfo();

}
