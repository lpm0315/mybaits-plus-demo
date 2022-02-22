package com.example.mybaitsplusdemo.Web.Mapper;

import com.baomidou.mybatisplus.extension.api.R;
import com.example.mybaitsplusdemo.Web.Entity.RpUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liupm
 * @since 2022-02-21
 */
@Mapper
public interface RpUserMapper extends BaseMapper<RpUser> {

    @Select("select * from RP_USER")
    public List<RpUser> findAll();

}
