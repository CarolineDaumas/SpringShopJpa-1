package fr.fms;



import fr.fms.business.EShopBusinessImpl;
import fr.fms.entities.Article;

public class test {

	public static void main(String[] args) {
		
		EShopBusinessImpl eshopBusiness=new EShopBusinessImpl();
		
		for (Article articles: eshopBusiness.getListArticles()) {
			System.out.println(articles);
	}

}
}
