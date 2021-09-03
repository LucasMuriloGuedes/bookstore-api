package com.lucasmurilo.bookstore.repositories;

import com.lucasmurilo.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrroRepository extends JpaRepository<Livro, Integer> {
}
