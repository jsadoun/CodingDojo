package com.sadounj.prodsandcats.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(updatable=false)
    @DateTimeFormat (pattern="MM:dd:yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat (pattern="MM:dd:yyyy HH:mm:ss")
    private Date updatedAt;
    
	@PrePersist
	public void onCreate(){this.createdAt = new Date();}

	@PreUpdate
	public void onUpdate(){this.updatedAt = new Date();}
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "categories_products", 
        joinColumns = @JoinColumn(name = "category_id"), 
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
    
    public Category() {}

    public Category(String name) {
        this.name = name;
        this.createdAt = new Date();
        this.updatedAt = new Date();    
    }
    
    public Category (Long id, String name) {
    		this.id = id;
    		this.name = name;
    }
    
    //Getters & Setters
	public void setId(Long id){this.id=id;}
	public Long getById(){return id;}
	
	public void setName(String name){this.name=name;}
	public String getName(){return name;}
	
	public void setCreatedAt(Date date){this.createdAt = date;}
	public Date getCreatedAt(){return createdAt;}

	public void setUpdatedAt(Date date){this.updatedAt = date;}
	public Date getUpdatedAt(){return updatedAt;}


	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
