package com.codecool.subway.model.Item;

import com.codecool.subway.model.enums.Flavour;

public class Drink extends OrderItem {
    private final Flavour flavour;

    public Drink(Flavour flavour) {
        super(flavour.getPrice());
        this.flavour = flavour;
    }
}
