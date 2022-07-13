package fares.recipeproject.Recipeapp.bootstrap;

import fares.recipeproject.Recipeapp.models.recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fares.recipeproject.Recipeapp.services.RecipeService;


@Component
public class DataLoader implements CommandLineRunner {

    private final RecipeService recipeService;

    @Autowired
    public DataLoader(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Override
    public void run(String... args) throws Exception {
        recipe recipe1 = new recipe();
        recipe1.setId(1L);
        recipe1.setRecipeName("Wrapper");
        recipe1.setCost(1.5);

        recipeService.save(recipe1);

        recipe recipe2 = new recipe();
        recipe2.setId(2L);
        recipe2.setRecipeName("Burger");
        recipe2.setCost(2.5);

        recipeService.save(recipe2);


        System.out.println("Loaded recipes .............");




    }
}
