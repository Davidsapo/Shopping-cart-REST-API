package com.shopping.cart.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class RestApiException {

    private HttpStatus httpStatus;
    private String message;

}
