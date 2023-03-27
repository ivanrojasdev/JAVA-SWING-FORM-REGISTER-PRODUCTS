package com.ivan.venta.utils;

public class Validations {

    public static final String PRODUCT_NAME = "^[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\s]{2,40}$";
    public static final String STOCK = "^[\\d]{1,5}$";
    public static final String PRICE = "^[\\d]+([.][\\d]{1,2})?$";
    public static final String CODE = "^[a-zA-Z][0-9]{1,5}$";
}
