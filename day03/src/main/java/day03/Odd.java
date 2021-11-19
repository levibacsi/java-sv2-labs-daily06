//  Írj egy metódust, mely visszaad egy tömböt, amelyben 5 db tetszőleges páratlan szám van!


package day03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Odd {
    Random random = new Random();
    int[] oddNumbers =  new int[5];
    int counter = 0;

    public int[] oddNumberMaker (){
        for (int i = counter; i < 5; i++) {
            oddNumbers[i] = random.nextInt(10000);
            if (oddNumbers[i] % 2 == 0) {
                oddNumbers[i]++;
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if (i != j && oddNumbers[i] == oddNumbers[j]) {
                    counter = 0;
                    oddNumberMaker();
                }
            }
        }
        return oddNumbers;

    }

    public static void main(String[] args) {
        Odd odd = new Odd();
        System.out.println(Arrays.toString(odd.oddNumberMaker()));
    }
}
