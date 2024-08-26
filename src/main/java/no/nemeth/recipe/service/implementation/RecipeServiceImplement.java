package no.nemeth.recipe.service.implementation;

import no.nemeth.recipe.entity.Recipe;
import no.nemeth.recipe.repository.RecipeRepository;
import no.nemeth.recipe.service.RecipeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeServiceImplement implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImplement(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe createRecipe(Recipe recipe) {
        //chaning the time of edit to now
        recipe.setRecipeCreated(LocalDateTime.now());
        return recipeRepository.save(recipe);
    }


    @Override
    public Recipe getRecipeById(Long id) {
        return recipeRepository.findById(id).get();
    }

    @Override
    public void deleteRecipe(Long id) {
        Recipe recipeToDelete = recipeRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("recipe does not exist"));
        recipeRepository.deleteById(id);

    }

    @Override
    public Recipe updateRecipe(Long id,Recipe recipeNew) {
        Recipe recipeUpdated = recipeRepository.findById(id).get();
        recipeUpdated.setId(id);
        recipeUpdated.setName(recipeNew.getName());
        recipeUpdated.setDescription(recipeNew.getDescription());
        recipeUpdated.setIngredients(recipeNew.getIngredients());
        recipeUpdated.setDirections(recipeNew.getDirections());
        recipeUpdated.setRecipeCreated(LocalDateTime.now());
        System.out.println(recipeUpdated.toString());
        // save the updated recipe
        return recipeRepository.save(recipeUpdated);

    }
}
