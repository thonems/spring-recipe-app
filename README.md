# Recipe Management Application

This is a simple Spring Boot application for managing recipes, allowing users to create, update, view, and delete recipes. It stores recipes on a local server and was built with the aim of saving recipes from Instagram.

## Features

- View a list of all recipes
- Create new recipes
- Edit existing recipes
- Delete recipes
- Store recipes with name, description, ingredients, and directions
- Automatically saves the recipe creation/update timestamp

## Technologies Used

- **Java 17**
- **Spring Boot** (MVC, Dependency Injection)
- **Thymeleaf** 
- **MySQL** 
- **Maven** 

## Project Structure

### `RecipeController`

- Handles all HTTP requests and manages navigation between pages.
- Routes:
    - `/recipes`: List all recipes.
    - `/recipes/new`: Display form to create a new recipe.
    - `/recipes/edit/{id}`: Edit an existing recipe by its ID.
    - `/recipes/{id}`: Delete a recipe by its ID.



