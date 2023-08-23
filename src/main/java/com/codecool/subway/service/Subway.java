package com.codecool.subway.service;

import com.codecool.subway.model.Item.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Subway {
    private String name;
    private final List<OrderItem> orders;

    public Subway(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }
    public void addOrder(OrderItem item){
        orders.add(item);
    }
    public double sumOfOrdersPrices(){
       return orders.stream().map(OrderItem::getPrice).reduce(0.0, Double::sum);
    }
}
