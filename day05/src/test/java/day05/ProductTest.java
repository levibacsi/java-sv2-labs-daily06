package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product = new Product("fries", Type.MEDIUM, 50);

    @Test
    void getName() {
        assertEquals("fries", product.getName());
    }

    @Test
    void getType() {
        assertEquals(Type.MEDIUM, product.getType());
    }

    @Test
    void getPrice() {
        assertEquals(50, product.getPrice());
    }
}