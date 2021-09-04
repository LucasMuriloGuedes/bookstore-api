package com.lucasmurilo.bookstore.services;

import com.lucasmurilo.bookstore.DTO.CategoriaDTO;
import com.lucasmurilo.bookstore.domain.Categoria;
import com.lucasmurilo.bookstore.repositories.CategoriaRepository;
import com.lucasmurilo.bookstore.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! id: " + id + ", tipo: "+Categoria.class.getName()));
    }

    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Categoria insert(Categoria obj){
        return repository.save(obj);
    }

    public Categoria update(CategoriaDTO objDTO, Integer id) {
        Categoria obj = findById(id);
        obj.setNome(objDTO.getNome());
        obj.setDescricao(objDTO.getDescricao());
        return repository.save(obj);
    }

    public void delete(Integer id) {
        findById(id);
        try{
            repository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new com.lucasmurilo.bookstore.services.exception.DataIntegrityViolationException("Objeto não pode ser deletado, possui livros associados");
        }
    }
}
