package com.bridgelabz.fundoouser.exception;

public class PasswordException extends RuntimeException {      //<-custom exception class which shows the message we gave
                                                                // when we throw any new exception
    public PasswordException(String message) {                //	exception.
        super(message);
    }
}
