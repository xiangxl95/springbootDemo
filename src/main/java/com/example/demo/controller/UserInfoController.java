package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author xiangxl
 * @date 2021/12/23 16:15
 * @description:
 */
@Controller
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    /**
     * 保存人员信息
     * @param
     * @return
     */
    @RequestMapping(value = "/saveUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public String saveUserInfo(HttpServletRequest request){
        //获取前台参数
        String userInfo = request.getParameter("userInfo");
        //解析json字符串
        JSONObject jsonObject = JSONObject.parseObject(userInfo);
        //转为map
        Map map = jsonObject.getInnerMap();
        //调用保存方法
        int count = userInfoService.saveUserInfo(map);
        if(count != 1) {
            return "ERROR";
        }
        return "SUCCESS";
    }

    /**
     * 查询人员信息
     * @param
     * @return
     */
    @RequestMapping(value = "/queryUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public String queryUserInfo(HttpServletRequest request){
        //查询
        List<Map> list = userInfoService.queryUserInfo();
        return JSON.toJSONString(list);
    }

}
