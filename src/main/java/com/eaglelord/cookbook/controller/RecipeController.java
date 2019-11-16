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
        Ingredient ingredient = new Ingredient("Onion", "Yellow onion");
        Recipe recipe = new Recipe("MeatBalls", Arrays.asList(ingredient), "Minced meat");
        recipes.add(recipe);
        return recipes;
    }



  /*  @RequestMapping("/addRecipe")
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
    }*/
}
