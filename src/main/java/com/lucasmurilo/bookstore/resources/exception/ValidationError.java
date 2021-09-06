package com.lucasmurilo.bookstore.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    private List<FIeldMessage> erros = new ArrayList<>();


    public ValidationError() {
    }

    public ValidationError(Long timeStamp, Integer status, String error) {
        super(timeStamp, status, error);
    }

    public List<FIeldMessage> getErros() {
        return erros;
    }

    public void addError(String fieldName, String message){
        this.erros.add(new FIeldMessage(fieldName, message));
    }
}
