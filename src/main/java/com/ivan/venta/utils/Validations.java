package com.ivan.venta.utils;

public class Validations {

    public static final String PRODUCT_NAME = "^[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\s]{2,40}$";
    public static final String STOCK = "^[\\d]{1,5}$";
    public static final String PRICE = "^[\\d]+([.][\\d]{2})?$";
    public static final String CODE = "^[1-9]{1,8}$";
}
