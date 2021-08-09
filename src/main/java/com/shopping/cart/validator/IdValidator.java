package com.shopping.cart.validator;

import com.shopping.cart.exceptions.exceptions.IdException;
import com.shopping.cart.exceptions.exceptions.ProductException;
import com.shopping.cart.repository.PersonRepository;
import com.shopping.cart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdValidator {

    private final ProductRepository productRepository;

    private final PersonRepository personRepository;

    @Autowired
    public IdValidator(ProductRepository productRepository, PersonRepository personRepository) {
        this.productRepository = productRepository;
        this.personRepository = personRepository;
    }

    public void validProductId(Long productId) {
        validId(productId);
        if (!productRepository.existsById(productId)) {
            throw new ProductException("Product with id " + productId + " does not exist.");
        }
    }

    public void validPersonId(Long personId) {
        validId(personId);
        if (!personRepository.existsById(personId)) {
            throw new ProductException("Person with id " + personId + " does not exist.");
        }
    }

    private void validId(Long id) {
        if (id < 0) {
            throw new IdException("Id can not be less than zero.");
        }
    }
}
