package com.eaglelord.cookbook.model;

import java.io.Serializable;
import java.util.List;

public class Recipe implements Serializable {
    private String name;
    private List<Ingredient> ingredients;

    private String description;

    public Recipe(String name, List<Ingredient> ingredients, String description){
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
