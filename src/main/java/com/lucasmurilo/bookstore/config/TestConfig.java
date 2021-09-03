package com.lucasmurilo.bookstore.config;

import com.lucasmurilo.bookstore.domain.Categoria;
import com.lucasmurilo.bookstore.domain.Livro;
import com.lucasmurilo.bookstore.repositories.CategoriaRepository;
import com.lucasmurilo.bookstore.repositories.LivrroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivrroRepository livrroRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");

        Livro l1 = new Livro(null, "Clean Code", "Robert Mártim", "Lorem Ipsum lorem Ipsum", cat1);

        cat1.getLivros().add(l1);

        categoriaRepository.save(cat1);
        livrroRepository.save(l1);
        

    }
}
