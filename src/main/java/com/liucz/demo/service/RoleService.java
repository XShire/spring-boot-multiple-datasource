package com.liucz.demo.service;

import com.liucz.demo.form.RoleForm;
import com.liucz.demo.mapper.banpai.RoleMapper;
import com.liucz.demo.model.banpai.Role;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;


    public void insert(RoleForm form){

        Role role = new Role();
        BeanUtils.copyProperties(form, role);
        roleMapper.insertSelective(role);

    }
}
