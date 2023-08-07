package de.crud.server.exceptions;

import java.rmi.server.UID;

public class RescourceNotFound extends RuntimeException {
    private static final long SerialVersionUID = 1L;
    public RescourceNotFound(String message){
        super(message);
    }




}
