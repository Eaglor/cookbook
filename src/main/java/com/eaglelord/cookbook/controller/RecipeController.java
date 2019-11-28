package com.eaglelord.cookbook.controller;

import com.eaglelord.cookbook.model.Ingredient;
import com.eaglelord.cookbook.model.Recipe;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/recipes")
public class RecipeController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Recipe> fetchAll() {
        List<Recipe> recipes = new ArrayList<>();
        Ingredient i1 = new Ingredient("Onion", "Onion grated");
        Ingredient i2 = new Ingredient("Minced meat", "Meat from land-living creature chopped in small pieces");
        Ingredient i3 = new Ingredient("Breadcrumbs", "Breadcrumbs or similar");
        Ingredient i4 = new Ingredient("Egg", "Egg raw and quickly whipped");
        Ingredient i5 = new Ingredient("Spices & salt", "Spice it up after taste");
        Recipe recipe = new Recipe("MeatBalls", Arrays.asList(i1, i2, i3, i4 ), "Soak spices after taste with Onion and Breadcrumbs together for 5 min then add the meat " +
                "and mix then add egg and mix again with your hands or wooden fork carefully");
        recipes.add(recipe);
        return recipes;
    }



}
