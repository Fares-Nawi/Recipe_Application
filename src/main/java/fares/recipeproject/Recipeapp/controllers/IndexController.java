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

    private CategoryRepositories categoryRepositories;
    private UnitOfMeasureRepositories unitOfMeasureRepositories;


    public IndexController(CategoryRepositories categoryRepositories, UnitOfMeasureRepositories unitOfMeasureRepositories) {
        this.categoryRepositories = categoryRepositories;
        this.unitOfMeasureRepositories = unitOfMeasureRepositories;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        Optional<Category> categoryOptional = categoryRepositories.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepositories.findByDescription("Cup");

        //todo add ifPresent(Consumer) to avoid "NoSuchElementException" if the description not found

        System.out.println("Cat Id is : "+categoryOptional.get().getId());
        System.out.println("UOM Id is : "+unitOfMeasureOptional.get().getId());


        return "index";
    }




}
