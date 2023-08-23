package com.codecool.subway.model.enums;

public enum Flavour {
    COCA_COLA(1), FANTA(2), ICE_TEA(3);
    private final double price;

    Flavour(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
