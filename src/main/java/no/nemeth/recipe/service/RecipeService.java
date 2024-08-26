package no.nemeth.recipe.service;


import no.nemeth.recipe.entity.Recipe;

import java.util.List;


public interface RecipeService {

    List<Recipe> getAllRecipes();

    Recipe createRecipe(Recipe recipe);

    Recipe getRecipeById(Long id);

    void deleteRecipe(Long id);

    Recipe updateRecipe(Long id,Recipe recipe);


}
