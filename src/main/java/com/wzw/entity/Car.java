package com.wzw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wei
 * @Date 2021/6/12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Integer num;
    private String brand;
    private Double price;
}
