package com.example.springscheduling.repositories;

import com.example.springscheduling.models.Test;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository {


    @Select("select * from tb_test")
    @Results({
            @Result(column = "id", property = "id")
    })
    List<Test> getAllTest();



}
