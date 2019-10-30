package com.eaglelord.cookbook;

import jdk.jfr.FlightRecorderPermission;
import model.Recipe;
import model.UserInput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
public class CookBook {
    public List<Recipe> recipe;
    private String ingredient;

    @RequestMapping("/addRecipe")
    public void setRecipe(List<Recipe> recipe) {
        this.recipe = recipe;
    }

    @RequestMapping
    public void addIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @RequestMapping
    public String getIngredient() {
        return this.ingredient;
    }
}
