package com.example.javawsclient.demo;

import com.example.javawsclient.service.*;

public class TestService {
    public static void main(String[] args) {
        ProductServiceService productSS = new ProductServiceService();
        ProductService productService = productSS.getProductServicePort();
        Product product = new Product();
        product.setId(1);
        product.setName("Macbook M1 Pro");
        product.setPrice(1700);
        product.setQuantity(12);
        productService.addProduct(product);
    }
}
