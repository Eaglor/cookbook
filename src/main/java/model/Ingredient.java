package model;

public class Ingredient {
    private String name;
    private String description;
    private String alternative;

    private Ingredient ingredient(String name, Measure measure, String description, String alternative){

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

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }
}
