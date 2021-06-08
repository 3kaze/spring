package com.wzw.entity;

import lombok.Data;

/**
 * @author wei @Date 2021/6/7
 */
@Data
public class User {

    private Integer id;

    private String name;

    public User() {
        System.out.println("通过无参构造创建User对象");
    }
}
