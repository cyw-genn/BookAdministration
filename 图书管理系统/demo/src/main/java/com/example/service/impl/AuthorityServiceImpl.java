package com.example.service.impl;

import com.example.entity.Authority;
import com.example.mapper.AuthorityMapper;
import com.example.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorityServiceImpl implements AuthorityService{
    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public List<Authority> findAll(){return authorityMapper.findAll();}

    @Override
    public int save(Authority authority){
        return authorityMapper.save(authority);
    }

    @Override
    public Integer delete(int id){
        return authorityMapper.delete(id);
    }

    @Override
    public Authority get(int id){
        return authorityMapper.get(id);
    }

    @Override
    public int update(Authority authority){
        return authorityMapper.update(authority);
    }
}
