package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.productDao;
import kodlamaio.northwind.entities.concretes.Product;


@Service
public class ProductManager implements ProductService{
	
	private productDao productDao;
	
	@Autowired
	public ProductManager(productDao productDao) {
		super();
		this.productDao = productDao;
		
	}
	

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}
	

}
