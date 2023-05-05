package com.secretSauce.secretSauce.repos;

import com.secretSauce.secretSauce.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    public Recipe getRecipeByIngredients(String ingredients);
}