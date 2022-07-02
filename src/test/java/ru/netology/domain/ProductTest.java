package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void shouldUseEquals() {
        Product first = new Product(3, "Фрейд", 123);
        Product second = new Product(3, "Фрейд", 123);
        assertEquals(first, second);
    }

    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Product();
        product.toString();
    }
}
