package net.codejava.hibernate;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "PRODUCTDETAIL")
public class ProductDetail {
	
	@Id
	@Column(name = "PRODUCT_ID")
    @GeneratedValue(generator = "newGenerator")
    @GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = { @Parameter(value = "product", name = "property")} )
	private long productId;
	
    private String partNumber;
    private String dimension;
    private float weight;
    private String manufacturer;
    private String origin;
    
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PRODUCT_ID")
    private Product product;
    
    public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
    
    

}
