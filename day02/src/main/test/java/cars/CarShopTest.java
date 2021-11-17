package cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {
    CarShop carShop = new CarShop("Best Cars", 20_000_000);

    @BeforeEach
    void init(){
        carShop.addCar(new Car("Toyota", 1.6, Color.GREY, 5000000));
        carShop.addCar(new Car("Honda", 1.8, Color.BLACK, 6000000));
        carShop.addCar(new Car("Toyota", 1.4, Color.BLUE, 4000000));
    }

    @Test
    void createCarShopTest(){

        assertEquals("Best Cars", carShop.getName());
        assertEquals(20_000_000, carShop.getMaxPrice());
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void addCarWithValidPriceTest() {
        boolean result = carShop.addCar(new Car("Toyota", 1.6, Color.GREY, 5000000));

        assertTrue(result);
        assertEquals(4, carShop.getCarsForSell().size());
        assertEquals("Toyota", carShop.getCarsForSell().get(0).getBrand());
    }

    @Test
    void addCarWithInvalidPriceTest() {
        boolean result = carShop.addCar(new Car("Toyota", 1.6, Color.GREY, 20_000_001));

        assertFalse(result);
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void sumCarPrice() {
        assertEquals(15_000_000, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThan() {
        assertEquals(1, carShop.numberOfCarsCheaperThan(4_000_000));
        assertEquals(0, carShop.numberOfCarsCheaperThan(3_999_999));
    }

    @Test
    void carsWithBrand() {
        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("Suzuki").size());
    }
}