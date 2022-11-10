package com.example.mapper;

import com.example.entity.Authority;

import java.util.List;

public interface UserMapper1 {
    int deleteByPrimaryKey(Integer id);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer id);

    List<Authority> selectAll();

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);

    Authority selectByUsernameAndPassword(Authority user);
}
