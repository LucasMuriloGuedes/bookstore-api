package com.lucasmurilo.bookstore.DTO;

import com.lucasmurilo.bookstore.domain.Livro;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class LivroDTO implements Serializable {

    private Integer id;
    @NotEmpty(message = "O Campo titulo e obrigatório!")
    @Length(min = 3, max = 100, message = "O Campo título deve ter entre 3 e 100 caracteres!")
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
