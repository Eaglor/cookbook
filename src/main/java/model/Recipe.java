package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;

    private String description;

    public Recipe recipe(String name, Ingredient ingredients, String description){
        this.name = name;
        List<Ingredient> ingred = new ArrayList<Ingredient>();
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
