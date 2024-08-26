package no.nemeth.recipe.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Table(name="recipes")
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="ingredients")
    private String ingredients;

    @Column(columnDefinition="TEXT")
    private String directions;

    @Column(name="recipe_created")
    LocalDateTime recipeCreated;


    public Recipe(){

    }

    public Recipe(Long id, String name, String description, String ingredients, String directions, LocalDateTime recipeCreated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
        this.recipeCreated = recipeCreated;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public LocalDateTime getRecipeCreated() {
        return recipeCreated;
    }

    public void setRecipeCreated(LocalDateTime recipeCreated) {
        this.recipeCreated = recipeCreated;
    }
}
