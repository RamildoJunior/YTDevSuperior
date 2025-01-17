package com.devsuperior.meuprimeiroprojeto;

import com.devsuperior.entities.Category;
import com.devsuperior.entities.Product;
import com.devsuperior.repositories.CategoryRepository;
import com.devsuperior.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MeuprimeiroprojetoApplication{


	public static void main(String[] args) {
		SpringApplication.run(MeuprimeiroprojetoApplication.class, args);
	}

}
