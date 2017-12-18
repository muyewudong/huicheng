package com.shsxt.xm.web.controller;

import com.shsxt.xm.api.po.BasUser;
import com.shsxt.xm.api.service.IBasUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lp on 2017/12/7.
 */
@Controller
@RequestMapping("user")
public class BasUserController {
    @Resource
    private IBasUserService basUserService;




    @RequestMapping("queryBasUserById")
    @ResponseBody
    public BasUser queryBasUserById(Integer id){
       return  basUserService.queryBasUserById(id);
    }
}
