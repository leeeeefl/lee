package com.lfl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lfl.pojo.CustomInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface CustDao extends BaseMapper<CustomInfo> {
//    @Select("select\n" +
//            "        id,name,age\n" +
//            "    from\n" +
//            "        custom_info\n" +
//            "    where\n" +
//            "        id = #{id}")
    CustomInfo selectCustInfo(Integer id);// 传入的数据类型不一样 会报错，名称一样就会报错
}
