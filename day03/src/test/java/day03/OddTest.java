package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddTest {

    Odd odd = new Odd();
    int [] numbers = odd.oddNumberMaker();

    @Test
    void oddNumberMakerTest() {
        for (int number: numbers) {
            assertEquals(1, number % 2);
        }
    }

    @Test
    void equalNumbersTest() {
        for (int i = 0; i < 5; i++){
            for (int j = i + 1; j < 5; j++){
                assertEquals(false,numbers[i] == numbers[j]);
            }
        }
    }
}