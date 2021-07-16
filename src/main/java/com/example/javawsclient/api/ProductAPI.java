package com.example.javawsclient.api;

import com.example.javawsclient.service.Product;
import com.example.javawsclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductAPI {
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
