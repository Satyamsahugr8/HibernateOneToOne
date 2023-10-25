package net.codejava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductManager {

	public static void main(String[] args) {
		
//		Configuration configuration = new Configuration().configure();
//        StandardServiceRegistryBuilder registry = new StandardServiceRegistryBuilder();
//        registry.applySettings(configuration.getProperties());
//        ServiceRegistry serviceRegistry = registry.build();
//         
//        // builds a session factory from the service registry
//        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//         
//        // obtains the session
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		// unidirectional
		
        
//     // creates a new product
//        Product product = new Product();
//        product.setName("Civic");
//        product.setDescription("Comfortable, fuel-saving car");
//        product.setPrice(20000);

//        // creates product detail
//        ProductDetail productDetail = new ProductDetail();
//        productDetail.setPartNumber("ABCDEFGHIJKL");
//        productDetail.setDimension("2,5m x 1,4m x 1,2m");
//        productDetail.setWeight(1000);
//        productDetail.setManufacturer("Honda Automobile");
//        productDetail.setOrigin("Japan");
//        
//        productDetail.setProduct(product);
//        
//     // persists the productDetail child --- then automatically parent will be inserted
//        session.save(productDetail);
        
        
        
        // bidirectional
		
		
		Product product = new Product();
		product.setName("City");
		product.setDescription("Comfortable, fuel-saving car");
		product.setPrice(10000);
		
		ProductDetail productDetail = new ProductDetail();
		productDetail.setPartNumber("ABCDEFGHIJKLM");
		productDetail.setDimension("2,5m x 1,4m x 1,2m");
		productDetail.setWeight(1500);
		productDetail.setManufacturer("Hero Auto");
		productDetail.setOrigin("India");
		
		productDetail.setProduct(product);
		product.setProductDetail(productDetail);
        
		
		session.save(product);
        
        
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

	}

}
