package fares.recipeproject.Recipeapp.controllers;


import fares.recipeproject.Recipeapp.domain.Category;
import fares.recipeproject.Recipeapp.domain.UnitOfMeasure;
import fares.recipeproject.Recipeapp.repositories.CategoryRepository;
import fares.recipeproject.Recipeapp.repositories.UnitOfMeasureRepository;
import fares.recipeproject.Recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting Index Page");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }




}
