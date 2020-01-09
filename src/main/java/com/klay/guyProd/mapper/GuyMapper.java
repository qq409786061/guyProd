package com.klay.guyProd.mapper;

import com.klay.guyProd.SqlProvider.GuySqlProvider;
import com.klay.guyProd.entity.Guy;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GuyMapper {

    @Select("SELECT * FROM Guy WHERE NAME = #{name}")
    Guy findGuyByName(@Param("name") String name);

    @Insert("INSERT INTO Guy(ID, AGE, NAME) VALUES(#{id}, #{age}, #{name})")
    int insert(@Param("id") String id, @Param("age") int age, @Param("name") String name);

    /**
     * 方式2：使用注解指定某个工具类的方法来动态编写SQL.
     */
    @SelectProvider(type = GuySqlProvider.class, method = "getList")
    List<Guy> getList();
}
