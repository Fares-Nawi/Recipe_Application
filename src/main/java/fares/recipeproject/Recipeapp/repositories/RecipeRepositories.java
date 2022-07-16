package fares.recipeproject.Recipeapp.repositories;

import fares.recipeproject.Recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepositories extends CrudRepository<Recipe, Long> {
}
