package com.example.javawsclient.controller;

import com.example.javawsclient.service.Product;
import com.example.javawsclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Product> getList() {
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Boolean update(@RequestParam Integer id, @RequestParam Integer quantity) {
        return productService.sellProduct(id, quantity);
    }
}
