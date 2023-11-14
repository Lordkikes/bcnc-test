package dev.guillermosg.bcnc.domain.exception;

/*
 * Exception thrown when a price is not found
 */

public class PriceNotFoundException extends RuntimeException {

    public static final String ERROR_CODE = "001";
    private static final long serialVersionUID = 1L;

    public PriceNotFoundException() {
        super();
    }
}
