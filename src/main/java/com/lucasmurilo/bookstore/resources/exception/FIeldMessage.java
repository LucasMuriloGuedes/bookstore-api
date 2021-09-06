package com.lucasmurilo.bookstore.resources.exception;

import java.io.Serializable;

public class FIeldMessage implements Serializable {
    private String fieldName;
    private String message;

    public FIeldMessage(){

    }

    public FIeldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
