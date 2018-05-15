package com.liucz.demo.service;

import com.liucz.demo.form.DemoForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {

    @Autowired
    DemoService demoService;

    @Test
    public void insert() {

        DemoForm form = new DemoForm();
        form.setParam1("测试啊测试");
        form.setCreateTime(new Date());
        form.setUpdateTime(new Date());
        demoService.insert(form);

    }
}