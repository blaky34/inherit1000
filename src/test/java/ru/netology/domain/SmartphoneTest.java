package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Smartphone smartphone = new Smartphone();
    }

    @Test
    public void shouldCastFromBaseClass() {
        Product product = new Smartphone();
        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
        }
    }

    @Test
    public void shouldUseEquals() {
        Product first = new Smartphone (5, "s8", 100500, "Samsung");
        Product second = new Smartphone (5, "s8", 100500, "Samsung");
        assertEquals(first, second);

    }

    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Smartphone();
        product.toString();
    }
}
