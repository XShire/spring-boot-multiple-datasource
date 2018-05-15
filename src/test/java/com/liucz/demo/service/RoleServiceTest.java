package com.liucz.demo.service;

import com.liucz.demo.form.RoleForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {

    @Autowired
    RoleService roleService;

    @Test
    public void insert() {

        RoleForm form = new RoleForm();
        form.setRole("测试角色");
        form.setIntro("我是一个测试角色啊");
        roleService.insert(form);

    }
}