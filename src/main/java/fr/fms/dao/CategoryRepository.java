package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.fms.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	public Category findByName(String name);

	@Query ("select C from Category C order by name ASC")
	public List<Category> listCategoriesAsc();

	@Query ("select C from Category C order by name DESC")
	public List<Category> listCategoriesDesc();


}
