/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Luis
 */
@Entity
public class Product extends EntityBase implements Serializable {

    public Product(String name, float price, int stock, Provider provider, Category category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.provider = provider;
        this.category = category;
    }

    public Product(Integer id) {
        super(id);
    }

    public Product() {
    }
    
    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @ManyToOne
    @JoinColumn(name = "providerId")
    private Provider provider;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
    
    public boolean sell(){
        if(this.stock>0){
            this.stock--;
            return true;
        }
        return false;
    }

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name+" - $"+this.price;
    }
}
