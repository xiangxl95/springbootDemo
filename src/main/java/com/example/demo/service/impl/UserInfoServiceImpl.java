package com.example.demo.service.impl;

import com.example.demo.dao.mapper.UserInfoMapper;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author xiangxl
 * @date 2021/12/23 16:12
 * @description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int saveUserInfo(Map map) {
        return userInfoMapper.insertUserInfo(map);
    }

    @Override
    public List<Map> queryUserInfo() {
        return userInfoMapper.queryUserInfo();
    }

}
