package fares.recipeproject.Recipeapp.controllers;


import fares.recipeproject.Recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class RecipeController {

   private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/"})
    public String showRecipe(Model model){

        model.addAttribute("recipes",recipeService.findAll());
        return "index";

    }
}
