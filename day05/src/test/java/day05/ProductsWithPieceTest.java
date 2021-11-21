package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsWithPieceTest {

    ProductsWithPiece productsWithPiece = new ProductsWithPiece(Type.MEDIUM);

    @Test
    void incrementCount() {
        productsWithPiece.incrementCount();
        assertEquals(2, productsWithPiece.getCount());
        assertEquals(Type.MEDIUM, productsWithPiece.getType());
    }
}