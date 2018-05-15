package com.liucz.demo.mapper.niuniu;

import com.liucz.demo.model.niuniu.Demo;

public interface DemoMapper {
    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}