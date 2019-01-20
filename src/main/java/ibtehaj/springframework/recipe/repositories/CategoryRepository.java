package ibtehaj.springframework.recipe.repositories;

import ibtehaj.springframework.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
