package fares.recipeproject.Recipeapp.controllers;


import fares.recipeproject.Recipeapp.domain.Category;
import fares.recipeproject.Recipeapp.domain.UnitOfMeasure;
import fares.recipeproject.Recipeapp.repositories.CategoryRepositories;
import fares.recipeproject.Recipeapp.repositories.UnitOfMeasureRepositories;
import fares.recipeproject.Recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {



    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {

        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes",recipeService.findAll());



        return "index";
    }




}
