package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from tb_user")
    List<Student> findAll();

    @Insert("insert into tb_user(id,name,age,sex)values(#{id},#{name},#{age},#{sex})")
    void addStudent(Student s);

    @Update("update tb_user set name=#{name},age=#{age},sex=#{sex} where id=#{id}")
    void updateStudent(Student s);

    @Delete("delete from tb_user where id=#{id}")
    void delectStudent(String id);

    @Select("select * from tb_user where id=#{id}")
    Student findByid(@Param("id")String id);
}
