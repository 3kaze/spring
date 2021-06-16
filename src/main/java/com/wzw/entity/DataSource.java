package com.wzw.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wei
 * @Date 2021/6/12
 */
@Data
@Component(value = "ds")
public class DataSource {
    @Value("root")
    private String user;
    @Value("root")
    private String password;
    @Value("jdbc:mysql://localhost:3308/library")
    private String url;
    @Value("com.mysql.cj.Driver")
    private String driverName;
}
