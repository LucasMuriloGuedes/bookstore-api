package com.lucasmurilo.bookstore.repositories;

import com.lucasmurilo.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivrroRepository extends JpaRepository<Livro, Integer> {

    @Query("SELECT obj FROM Livro obj WHERE obj.categoria.id = :id_cat  ORDER BY titulo")
    List<Livro> findAllCategoria(@Param(value = "id_cat") Integer id_cat);
}
