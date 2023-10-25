package net.codejava.hibernate;

import javax.persistence.*;


@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue
    private long productId;
    private String name;
    private String description;
    private float price;
    
    // Adding this line for bidirectional mapping 18 line to 28
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    private ProductDetail productDetail;
    
	public ProductDetail getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}
	
	
	
	
	public Product() {
		super();
	}

	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    
}