package com.eaglelord.cookbook.repository;

import com.eaglelord.cookbook.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
