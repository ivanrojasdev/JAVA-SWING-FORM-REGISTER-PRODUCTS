/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivan.venta;

/**
 *
 * @author Administrador
 */
public class Product {
    private String code;
    private String name;
    private String type;
    private int Stock;
    private double price;
    
    public Product(){}

    public Product(String code, String name, String type, int Stock, double price) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.Stock = Stock;
        this.price = price;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", type=" + type + ", Stock=" + Stock + ", price=" + price + '}';
    }
    
    

}
