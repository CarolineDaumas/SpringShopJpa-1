package fr.fms;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.ArticlePagination;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpa1Application implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private ArticlePagination articlePagination;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpa1Application.class, args);
	}
	
	@Override
	public void run(String...args)throws Exception {
		//categoryRepository.save(new Category ("Smartphone"));
		//articleRepository.save(new Article("S9", "Samsung", 250));
		//articleRepository.save(new Article("S8", "Samsung", 200));
		//articleRepository.save(new Article("GalaxyTab", "Samsung", 350));
		
//		Category smartphone=categoryRepository.save(new Category("Smartphones"));
//		Category tablet=categoryRepository.save(new Category("Tablettes"));
//		Category pc=categoryRepository.save(new Category("PC"));
//		
//		articleRepository.save(new Article("S10","Samsung", 500, smartphone));
//		articleRepository.save(new Article("S19","Samsung", 350, smartphone));
//		articleRepository.save(new Article("M10","Xiaomi", 100, smartphone));
//		
//		articleRepository.save(new Article("GalaxyTab","Samsung", 450, tablet));
//		articleRepository.save(new Article("IPad","Apple", 350, tablet));
//		
//		articleRepository.save(new Article("R510","Asus", 600, pc));
		
		
		
//		for (Article article : articleRepository.findByBrand("Samsung")) {
//			System.out.println(article);
//		}
//
//		for (Article articles : articleRepository.findByBrandAndPrice("Samsung", 250)) {
//			System.out.println(articles);
//		}
//
//		for (Article art : articleRepository.findByBrandContains("sung")) {
//			System.out.println(art);
//		}
//
//		for (Article arti : articleRepository.findByBrandAndPriceGreaterThan("Samsung", 260)) {
//			System.out.println(arti);
//		}
		
//		for (Article arts:articleRepository.searchArticles("sung", 200)) {
//			System.out.println(arts);
//		}
		
//		for (Article artis: articleRepository.findByCategoryId((long) 2)) {
//			System.out.println(artis);
//		}
		
//		for(Article a: articleRepository.findByBrandAndDescription("Apple", "IPad")) {
//			System.out.println(a);
//		}
		
		//articleRepository.deleteById((long) 5);
		
		
////		Article article = articleRepository.getById((long) 4);
////		article.setBrand("Huawei");
////		articleRepository.update(article);
//		
////		articleRepository.updateArticle("Huawei", (long) 4);
//		
////		articleRepository.updateArticles("Huawei", (long) 4);
		articleRepository.save(new Article((long) 4,"téléphone","Huawei",80,categoryRepository.findByName("smartphone")));
//		
//		
//		for (Category categories: categoryRepository.listCategoriesAsc()) {
//				System.out.println(categories);
//			};
//		
//
//		for (Category categorie: categoryRepository.listCategoriesDesc()) {
//				System.out.println(categorie);
//				};
//			
		
		for (Article articles: articleRepository.findAll()) {
			System.out.println(articles);
		}
		
		
		
	}
	}


