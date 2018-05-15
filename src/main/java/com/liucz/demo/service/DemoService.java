package com.liucz.demo.service;

import com.liucz.demo.form.DemoForm;
import com.liucz.demo.mapper.niuniu.DemoMapper;
import com.liucz.demo.model.niuniu.Demo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    DemoMapper demoMapper;

    public void insert(DemoForm form){

        Demo demo = new Demo();
        BeanUtils.copyProperties(form, demo);
        demoMapper.insertSelective(demo);

    }

}
