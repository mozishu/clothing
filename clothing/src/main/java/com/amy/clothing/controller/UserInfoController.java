package com.amy.clothing.controller;

import com.amy.clothing.dao.UserInfoMapper;
import com.amy.clothing.pojo.UserInfo;
import com.amy.clothing.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("/user")
@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping(value ="/getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public UserInfo getUserInfo(){
        return userInfoService.selectByPrimaryKey(1);
    }


}
