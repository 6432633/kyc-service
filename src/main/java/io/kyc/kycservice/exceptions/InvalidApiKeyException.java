package io.kyc.kycservice.exceptions;

public class InvalidApiKeyException extends Exception{
    public InvalidApiKeyException(String message){
        super(message);
    }
}
