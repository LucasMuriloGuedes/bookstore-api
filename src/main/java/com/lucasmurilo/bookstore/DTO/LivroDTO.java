package com.lucasmurilo.bookstore.DTO;

import com.lucasmurilo.bookstore.domain.Livro;

import java.io.Serializable;

public class LivroDTO implements Serializable {

    private Integer id;
    private String titulo;

    public LivroDTO(){

    }

    public LivroDTO(Livro livro){
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
