package com.example.entity;

import java.io.Serializable;

public class Authority implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Authority(Integer id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    public Authority(){

    }
    @Override
    public String toString(){
        return "Authority{"+"id="+id+", name='"+name+'\''+", password='"+password+'\''+'}';
    }
}
