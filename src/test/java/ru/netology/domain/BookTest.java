package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Book book = new Book();
    }

    @Test
    public void shouldCastFromBaseClass() {
        Product product = new Book();
        if (product instanceof Book) {
            Book book = (Book) product;
        }
    }

    @Test
    public void shouldUseEquals() {
        Product first = new Book (2, "Психология", 1000, "Фрейд");
        Product second = new Book (2, "Психология", 1000, "Фрейд");
        assertEquals(first, second);
    }


    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Book();
        product.toString();
    }
}