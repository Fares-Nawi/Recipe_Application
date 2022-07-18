package fares.recipeproject.Recipeapp.services;


import fares.recipeproject.Recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService{
   Set<Recipe> findAll();

   Recipe findById(Long id);

   Recipe save(Recipe object);

}
