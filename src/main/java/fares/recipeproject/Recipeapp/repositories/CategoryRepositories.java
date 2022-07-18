package fares.recipeproject.Recipeapp.repositories;

import fares.recipeproject.Recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepositories extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
