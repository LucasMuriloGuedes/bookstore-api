package com.lucasmurilo.bookstore.repositories;

import com.lucasmurilo.bookstore.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
