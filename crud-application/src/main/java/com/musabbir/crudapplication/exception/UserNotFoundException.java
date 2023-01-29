package com.musabbir.crudapplication.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("Could Find the User Notes "+ id);
    }
}
