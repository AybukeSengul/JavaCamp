package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;

public class Main {

	public static void main(String[] args) {
		//int sayilar[] = {1,2,3,4,5};
		//ArrayList<Integer> sayilar2  = new ArrayList<Integer>();
		//sayilar2.add(1);
		//sayilar2.add(3);
		//ToDo Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);

	}

}
