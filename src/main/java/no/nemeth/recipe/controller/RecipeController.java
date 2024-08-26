package no.nemeth.recipe.controller;


import no.nemeth.recipe.entity.Recipe;
import no.nemeth.recipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    //Get all recipes
    @GetMapping("/recipes")
    public String listRecipes(Model model){
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "recipes";

    }
    @GetMapping("/recipes/new")
    public String createRecipeForm(Model model){

        //creating empty recipe to hold the data form the form
        Recipe recipe = new Recipe();
        model.addAttribute("recipe",recipe);
        return "create_recipe";
    }

    @PostMapping("/recipes")
    public String saveRecipe(@ModelAttribute("recipe") Recipe recipe){
        recipeService.createRecipe(recipe);
        return "redirect:/recipes";
    }
    @GetMapping("/recipes/edit/{id}")
    public String updateRecipe(@PathVariable Long id,Model model){
        model.addAttribute("recipe", recipeService.getRecipeById(id));
        return "update_recipe";
    }

    @PostMapping("/recipes/{id}")
    public String updateRecipe(@PathVariable Long id, @ModelAttribute("recipe") Recipe recipe, Model model){
        recipeService.updateRecipe(id,recipe);
        return "redirect:/recipes";
    }

    @GetMapping("/recipes/{id}")
    public String deleteRecipe(@PathVariable Long id){
        recipeService.deleteRecipe(id);
        return "redirect:/recipes";

    }
}
// 