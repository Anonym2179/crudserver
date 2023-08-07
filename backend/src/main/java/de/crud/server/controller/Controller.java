package de.crud.server.controller;

import de.crud.server.exceptions.RescourceNotFound;
import de.crud.server.model.Product;
import de.crud.server.repository.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class Controller {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return this.productService.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product = productService.findById(id)
                .orElseThrow(() -> new RescourceNotFound("Product not found"));

        return ResponseEntity.ok(product);
    }
}
