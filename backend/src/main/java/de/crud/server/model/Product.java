package de.crud.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int product_id;

    private String product_name;
    private String Product_price;
    private String product_stock;

    public Product() {
    }

    public Product(String product_name, String product_price, String product_stock) {
        this.product_name = product_name;
        Product_price = product_price;
        this.product_stock = product_stock;
    }

    public String getProduct_stock() {
        return product_stock;
    }


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return Product_price;
    }

    public void setProduct_price(String product_price) {
        Product_price = product_price;
    }

    public void setProduct_stock(String product_stock) {
        this.product_stock = product_stock;
    }


}
