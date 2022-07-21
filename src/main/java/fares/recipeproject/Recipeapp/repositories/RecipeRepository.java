package fares.recipeproject.Recipeapp.repositories;

import fares.recipeproject.Recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
