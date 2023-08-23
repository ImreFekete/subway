package com.codecool.subway.model.Item;

public abstract class OrderItem {
    private final double price;

    public OrderItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
