package fares.recipeproject.Recipeapp.services.Map;

import fares.recipeproject.Recipeapp.domain.Recipe;
import fares.recipeproject.Recipeapp.repositories.RecipeRepository;
import fares.recipeproject.Recipeapp.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe>  recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
