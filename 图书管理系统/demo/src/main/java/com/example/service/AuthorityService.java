package com.example.service;

import com.example.entity.Authority;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AuthorityService {
    List<Authority> findAll();
    int save(Authority authority);
    Integer delete(int id);
    Authority get(int id);
    int update(Authority authority);
}
