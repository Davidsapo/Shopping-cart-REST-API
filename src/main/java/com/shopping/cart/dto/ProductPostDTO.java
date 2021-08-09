package com.shopping.cart.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Data
public class ProductPostDTO {

    @NotNull(message = "Product name required.")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Product name does not match pattern.")
    private String name;

    @NotNull
    @PositiveOrZero(message = "Product price can not be less then 0!")
    private BigDecimal price;

}
