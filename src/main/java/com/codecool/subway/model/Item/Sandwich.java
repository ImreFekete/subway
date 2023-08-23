package com.codecool.subway.model.Item;

import com.codecool.subway.model.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends OrderItem {
    private final List<Ingredient> ingredients;

    public Sandwich(List<Ingredient> ingredients) {
        super(ingredients.stream().map(Ingredient::price).reduce(0.0, Double::sum));
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}
