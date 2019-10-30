package com.eaglelord.cookbook;

import jdk.jfr.FlightRecorderPermission;
import model.UserInput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
public class CookBook {
    public List<String> recipe;
    private String ingredient;

    @RequestMapping("/addRecipe")
    public void setRecipe(List<String> recipe) {
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
