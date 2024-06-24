package com.dm.dmspringboot;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper extends BaseMapper<TestEntity> {

    List<TestEntity> selectAll();
}
