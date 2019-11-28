package com.eaglelord.cookbook;

import com.eaglelord.cookbook.model.Ingredient;
import com.eaglelord.cookbook.model.Recipe;
import com.eaglelord.cookbook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    private RecipeRepository recipeRepository;

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Welcome too eagleLords cooking trickery");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName : beanNames){
                System.out.println(beanName);
            }

            if (recipeRepository.count() == 0) {
                Ingredient i1 = new Ingredient("Onion", "Onion grated");
                Ingredient i2 = new Ingredient("Minced meat", "Meat from land-living creature chopped in small pieces");
                Ingredient i3 = new Ingredient("Breadcrumbs", "Breadcrumbs or similar");
                Ingredient i4 = new Ingredient("Egg", "Egg raw and quickly whipped");
                Ingredient i5 = new Ingredient("Spices & salt", "Spice it up after taste");
                Recipe recipe = new Recipe("MeatBalls", Arrays.asList(i1, i2, i3, i4 ), "Soak spices after taste with Onion and Breadcrumbs together for 5 min then add the meat " +
                        "and mix then add egg and mix again with your hands or wooden fork carefully");
                recipeRepository.save(recipe);
            }
        };
    }

}
