package fares.recipeproject.Recipeapp.models;

public class recipe extends BaseEntity{

    private String recipeName;
    private double cost;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
