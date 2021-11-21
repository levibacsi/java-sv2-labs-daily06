package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @BeforeEach
    void init() {
        store.addProduct(new Product("hamburger", Type.BIG, 100));
        store.addProduct(new Product("cheeseburger", Type.BIG, 110));
        store.addProduct(new Product("nuggets", Type.MEDIUM, 90));
    }

    @Test
    void addProduct() {
        Product product4 = new Product("fries", Type.SMALL, 80);
        store.addProduct(product4);
        assertEquals(4, store.getProductList().size());
    }

    @Test
    void getProductNumberByType() {
        assertEquals(2, store.getProductNumberByType(Type.BIG));
        assertEquals(0, store.getProductNumberByType(Type.SMALL));
    }

    @Test
   void getProductNumbers() {
      assertEquals("BIG: 2", store.getProductNumbers().get(0));
      assertEquals("SMALL: 0", store.getProductNumbers().get(2));
  }
}