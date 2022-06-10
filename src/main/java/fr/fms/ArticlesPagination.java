package fr.fms;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import fr.fms.entities.Article;

public interface ArticlesPagination extends PagingAndSortingRepository<Article, Long>{
	
	static Page<Article> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
}
	

	