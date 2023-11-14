package dev.guillermosg.bcnc.infrastructure.adapters.input.rest.errorhandlers;

import dev.guillermosg.bcnc.application.ports.dto.ErrorDTO;
import dev.guillermosg.bcnc.domain.exception.PriceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

/**
 * The type Global exception handler.
 */

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    /**
     * Handle unavailable balance exception response entity.
     *
     * @param locale the locale
     * @return the response entity
     */
    @ExceptionHandler(PriceNotFoundException.class)
    public ResponseEntity<Object> handleUnavailableBalanceException(Locale locale) {
        String errorMessage = messageSource.getMessage("message.exception.pricenotfound", null, locale);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ErrorDTO.builder().codResponse(PriceNotFoundException.ERROR_CODE)
                        .desResponse(errorMessage).build());
    }

}
