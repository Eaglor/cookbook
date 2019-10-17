package com.eaglelord.cookbook;

import jdk.jfr.FlightRecorderPermission;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
public class CookBook {
    private List<String> recipe;
    private String ingredient;

    @RequestMapping("/addRecipe")
    public void setRecipe(List<String> recipe) {
        this.recipe = setRecipe(ingredient);

    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void addIngredient(String ingredient) {
        this.getIngredient() = "";
    }
}
