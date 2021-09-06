package com.lucasmurilo.bookstore.DTO;

import com.lucasmurilo.bookstore.domain.Categoria;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class CategoriaDTO implements Serializable {

    private Integer id;
    @NotEmpty(message = "O nome não pode ser vazio!")
    @Length(min = 3, max = 100, message = "O campo nome tem que ter entre 3 e 100 caracteres!")
    private String nome;
    @NotEmpty(message = "Nome descrição não pode ser vazio!")
    @Length(min = 3, max = 200, message = "O campo descrição tem que ter entre 3 e 200 caracteres!")
    private String descricao;
    public CategoriaDTO(){

    }

    public CategoriaDTO(Categoria categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
        this.descricao = categoria.getDescricao();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
