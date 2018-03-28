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
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private float price;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
    private Date updatedAt;
    
	@PrePersist
	public void onCreate(){this.createdAt = new Date();}

	@PreUpdate
	public void onUpdate(){this.updatedAt = new Date();}
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "categories_products", 
        joinColumns = @JoinColumn(name = "product_id"), 
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;
    
    public Product() {}
    
    public Product(Long id, String name, String description, float price) {
    	this.id = id;
    	this.name = name;
    	this.description = description;
    	this.price = price;
    this.createdAt = new Date();
    this.updatedAt = new Date();  
    }
    
    //Getters & Setters
	public void setId(Long id){this.id=id;}
	public Long getId(){return id;}
	
	public void setName(String name){this.name=name;}
	public String getName(){return name;}
	
	public void setDesc(String desc) {this.description=description;}
	public String getDesc() {return description;}
	
	public void setPrice(float price) {this.price = price;}
	public float getPrice() {return price;}
	
	public void setCreatedAt(Date date){this.createdAt = date;}
	public Date getCreatedAt(){return createdAt;}

	public void setUpdatedAt(Date date){this.updatedAt = date;}
	public Date getUpdatedAt(){return updatedAt;}
	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
