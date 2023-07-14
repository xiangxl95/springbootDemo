package com.example.demo.service;

import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * @author xiangxl
 * @date 2021/12/23 16:11
 * @description:
 */
public interface UserInfoService {
    /**
     * 保存人员信息
     * @param map
     * @return
     */
    int saveUserInfo(Map map);

    /**
     * 查询人员信息
     * @return
     */
    @MapKey("id")
    List<Map> queryUserInfo();

}
