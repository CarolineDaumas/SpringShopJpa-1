package fr.fms.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;

public class EShopBusinessImpl implements EShopBusiness {

	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Article> getListArticles() {
		
		return articleRepository.findAll() ;
	}

}
