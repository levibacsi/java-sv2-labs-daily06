package cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("Toyota", 1.6, Color.GREY, 5_000_000);

    @Test
    void decreasePrice() {
        car.decreasePrice(10);
        assertEquals(4500000, car.getPrice());
    }

    @Test
    void decreasePrice0() {
        car.decreasePrice(0);
        assertEquals(5000000, car.getPrice());
    }

    @Test
    void decreasePrice100() {
        car.decreasePrice(100);
        assertEquals(0, car.getPrice());
    }

    @Test
    void decreasePriceNegative() {
        car.decreasePrice(-1);
        assertEquals(5_050_000, car.getPrice());
    }

    @Test
    void createCarTest(){
        assertEquals("Toyota", car.getBrand());
        assertEquals(1.6, car.getEngineSize());
        assertEquals(Color.GREY, car.getColor());
        assertEquals(5000000, car.getPrice());
    }
}