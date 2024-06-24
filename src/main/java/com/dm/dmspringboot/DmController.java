package com.dm.dmspringboot;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DmController {

    @Resource
    private TestMapper mapper;

    @GetMapping("/all")
    public List<TestEntity> queryEntities() {
        return mapper.selectAll();
    }
}
