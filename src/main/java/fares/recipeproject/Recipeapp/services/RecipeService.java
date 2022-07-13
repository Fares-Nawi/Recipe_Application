package fares.recipeproject.Recipeapp.services;

import fares.recipeproject.Recipeapp.models.recipe;

import java.util.Set;

public interface RecipeService {
    Set<recipe> findAll();

    recipe findById(Long id);

    recipe save(recipe object);


}
