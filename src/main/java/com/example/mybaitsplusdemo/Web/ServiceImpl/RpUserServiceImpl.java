package com.example.mybaitsplusdemo.Web.ServiceImpl;

import com.example.mybaitsplusdemo.Web.Entity.RpUser;
import com.example.mybaitsplusdemo.Web.Mapper.RpUserMapper;
import com.example.mybaitsplusdemo.Web.Service.RpUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liupm
 * @since 2022-02-21
 */
@Component
public class RpUserServiceImpl extends ServiceImpl<RpUserMapper, RpUser> implements RpUserService {

    @Autowired
    private RpUserMapper rpUserMapper;
    public List<RpUser> findAll(){
        return rpUserMapper.findAll();
    }



}
