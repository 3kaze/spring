package com.wzw.entity;

import com.wzw.myinterface.MyInterface;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author wei
 * @Date 2021/6/13
 */
@Data
@Component
public class Repository {
    @Autowired
    @Qualifier(value = "ds")
    private DataSource dataSource;

    @Autowired
    @Qualifier(value = "myImplement1")
    private MyInterface myinterface;
}
