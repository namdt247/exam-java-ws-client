package com.example.javawsclient.myService;

import com.example.javawsclient.service.ProductService;
import com.example.javawsclient.service.ProductServiceService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Bean
    public ProductService productService() {
        ProductServiceService productSS = new ProductServiceService();
        ProductService productService = productSS.getProductServicePort();
        return productService;
    }
}
