package com.example.crud.Domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

// Repository - camada intermediaria entre o banco de dados e regra de negocio e tem metodos para leitura, gravação e exclusão de dados
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findAllByActiveTrue();
}
