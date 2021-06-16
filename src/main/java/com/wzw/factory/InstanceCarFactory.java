package com.wzw.factory;

import com.wzw.entity.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wei
 * @Date 2021/6/12
 */
public class InstanceCarFactory {
    private Map<Integer, Car> carMap;
    public InstanceCarFactory() {
        carMap = new HashMap<Integer, Car>();
        carMap.put(1, new Car(1, "奥迪", 11.2));
        carMap.put(2, new Car(2, "奥拓", 22.2));
    }
    public Car getCar(Integer num) {
        return carMap.get(num);
    }
}
