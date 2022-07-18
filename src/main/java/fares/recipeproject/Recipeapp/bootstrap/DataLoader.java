package fares.recipeproject.Recipeapp.bootstrap;

import fares.recipeproject.Recipeapp.domain.Ingredient;
import fares.recipeproject.Recipeapp.domain.Recipe;
import fares.recipeproject.Recipeapp.repositories.RecipeRepositories;
import fares.recipeproject.Recipeapp.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
public class DataLoader implements CommandLineRunner {

    private final RecipeService recipeService;


    @Autowired
    public DataLoader(RecipeService recipeService) {
        this.recipeService = recipeService;
    }




    @Override
    public void run(String... args) throws Exception {
        Recipe recipe1 = new Recipe();
        recipe1.setId(1L);
        recipe1.setDescription("Wrapper");


        recipeService.save(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setId(2L);
        recipe2.setDescription("Burger");


        recipeService.save(recipe2);


        System.out.println("Loaded recipes .............");


    }
}
