package com.lucasmurilo.bookstore.config;

import com.lucasmurilo.bookstore.domain.Categoria;
import com.lucasmurilo.bookstore.domain.Livro;
import com.lucasmurilo.bookstore.repositories.CategoriaRepository;
import com.lucasmurilo.bookstore.repositories.LivrroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration

public class TestConfig {

    /*

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivrroRepository livrroRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
        Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
        Categoria cat3 = new Categoria(null, "Biografias", "Livro de Biografias");

        Livro l1 = new Livro(null, "Clean Code", "Robert Mártim", "Lorem Ipsum lorem Ipsum", cat1);
        Livro l2 = new Livro(null,"Engenharia de software", "Lucas Murilo", "Lucao de cuiaba escreveu", cat1);
        Livro l3 = new Livro(null, "Interestelar", "Albert Einsten", "Livro sobre a teoria da relatividade", cat2);
        Livro l4 = new Livro(null, "Jo Soares", "Pedro Bial", "Livro sobre a vida de Jo Soares", cat3);
        Livro l5 = new Livro(null, "Furacão Anitta", "Leo Dias", "Livro sobre o comeco da carreira de Anitta", cat2);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().add(l3);
        cat3.getLivros().addAll(Arrays.asList(l4, l5));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        livrroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));

        }

        */



}
