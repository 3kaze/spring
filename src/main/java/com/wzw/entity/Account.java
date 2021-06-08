package com.wzw.entity;

import lombok.Data;

/**
 * @author wei @Date 2021/6/9
 */
@Data
public class Account {

    private Integer id;

    private String name;

    public Account() {
        System.out.println("创建了一个Account对象");
    }
}
