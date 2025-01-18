package com.devsuperior.meuprimeiroprojeto.repositories;


import com.devsuperior.meuprimeiroprojeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
