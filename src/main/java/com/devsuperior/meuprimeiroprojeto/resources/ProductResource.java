package com.devsuperior.meuprimeiroprojeto.resources;

import com.devsuperior.meuprimeiroprojeto.entities.Product;
import com.devsuperior.meuprimeiroprojeto.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product>FinById(@PathVariable Long id){
        Product cat = productRepository.findById(id).get();
        return ResponseEntity.ok().body(cat);
    }


}
