package com.codecool.subway.service;

import com.codecool.subway.model.Item.Drink;
import com.codecool.subway.model.Item.Sandwich;
import com.codecool.subway.model.enums.Flavour;
import com.codecool.subway.model.ingredient.Ingredient;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubwayTest {
    private final Subway subway = new Subway("Subway");

    @Test
    void sumOfDrinkOrdersPrices() {
        Drink drink = new Drink(Flavour.FANTA);
        Drink drink1 = new Drink(Flavour.ICE_TEA);
        subway.addOrder(drink);
        subway.addOrder(drink1);
        assertEquals(5, subway.sumOfOrdersPrices());
    }

    @Test
    void sumOfSandwichOrderPrice() {
        List<Ingredient> ingredients = new ArrayList<>(){{
            add(new Ingredient("Lettuce", 1));
            add(new Ingredient("Bread", 2));
        }};
        Sandwich sandwich = new Sandwich(ingredients);
        subway.addOrder(sandwich);
        assertEquals(3, subway.sumOfOrdersPrices());
    }
}