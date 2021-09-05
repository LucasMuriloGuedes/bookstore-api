package com.lucasmurilo.bookstore.services;

import com.lucasmurilo.bookstore.domain.Livro;
import com.lucasmurilo.bookstore.repositories.CategoriaRepository;
import com.lucasmurilo.bookstore.repositories.LivrroRepository;
import com.lucasmurilo.bookstore.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivrroRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Livro não encontrado! O Id: " + id + ", da class: " + Livro.class.getName()));
    }

    public List<Livro> findAll(Integer id_cat){

        categoriaService.findById(id_cat);
        return repository.findAllCategoria(id_cat);
    }
}
