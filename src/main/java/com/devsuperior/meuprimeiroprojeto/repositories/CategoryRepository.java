package com.devsuperior.meuprimeiroprojeto.repositories;

import com.devsuperior.meuprimeiroprojeto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    }

