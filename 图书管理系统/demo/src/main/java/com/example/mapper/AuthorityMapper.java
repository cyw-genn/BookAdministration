package com.example.mapper;

import com.example.entity.Authority;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface AuthorityMapper {
    @Select("select * from authority")
    List<Authority> findAll();

    @Insert("insert into authority (id,name,password) values(#{id},#{name},#{password})")
    public int save(Authority authority);

    @Delete("delete from authority where id=#{id}")
    public int delete(int id);

    @Select("select * from authority where id=#{id}")
    public Authority get(int id);

    @Update("update authority set name=#{name},password=#{password} where id=#{id}")
    public int update(Authority authority);
}
