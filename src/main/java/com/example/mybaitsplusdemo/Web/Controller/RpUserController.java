package com.example.mybaitsplusdemo.Web.Controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.mybaitsplusdemo.Web.Entity.RpUser;
import com.example.mybaitsplusdemo.Web.Service.RpUserService;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liupm
 * @since 2022-02-21
 */
@RestController
@RequestMapping("/rpUser")
public class RpUserController {
    @Autowired
    RpUserService rpUserService;

    @GetMapping("/test")
    public RpUser test(){
        rpUserService.list().forEach(System.out::println);
        System.out.println(rpUserService.count());
        RpUser rpUser = new RpUser();
        rpUser.setUsergroups("海口市");

        return rpUserService.getById("{3451810C-5369-87A3-9386-A5B35454B31}");
    }

    @GetMapping("/test1")
    public RpUser test1(){
        rpUserService.findAll().forEach(System.out::println);
        System.out.println(rpUserService.count());
        RpUser rpUser = new RpUser();
        rpUser.setUsergroups("海口市");

        return rpUserService.getById("{3451810C-5369-87A3-9386-A5B35454B31}");
    }

    @GetMapping("/test2")
    public void test2(){
        QueryWrapper<RpUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("USERGROUPS","海口市");
        queryWrapper.eq("STATUS","1");
        queryWrapper.select("id","name","PASSWORD","USERGROUPS","STATUS");
        rpUserService.list(queryWrapper).forEach(System.out::println);
        //System.out.println(rpUserService.count(queryWrapper));

    }
}

