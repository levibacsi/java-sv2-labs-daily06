package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositiveNumberContainer pos = new PositiveNumberContainer();

        System.out.println("Enter positive numbers");
        double number;
        while ((number = scanner.nextDouble()) > 0) {
            pos.addNumber(number);
        }
        System.out.println(pos.getNumbers());
    }
}
