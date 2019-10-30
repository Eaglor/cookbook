package model;

public class Ingredient {
    private String name;
    private String description;

    private Ingredient ingredient(String name, Measure measure, String description){
        this.name = name;
        Measure me = new Measure();
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

