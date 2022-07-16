package fares.recipeproject.Recipeapp.repositories;

import fares.recipeproject.Recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositories extends CrudRepository<Category, Long> {
}
