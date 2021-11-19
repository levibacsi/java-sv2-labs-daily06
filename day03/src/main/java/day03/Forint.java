//
//  Írj egy metódust, mely paraméterként egy összeget (egész számot) kap,
//  és a magyar fizetési kerekítések szerint visszaadja a fizetendő összeget!
//  (Tehát: Ha a kapott összeg 1-re vagy 2-re végződik, akkor 0-ra kerekít,
//  ha 3-ra, 4-re, 6-ra vagy 7-re, akkor 5-re kerekít,
//  ha pedig 8-ra vagy 9-re, akkor 10-re kerekít.
//  Ha 5-re vagy 0-ra végződik az összeg, akkor nincs kerekítés.)

package day03;

import java.util.Scanner;

public class Forint {
    public int rounder (int number){
        int remainder = number % 5;
        if (remainder < 3) {
            number -= remainder;
        }
        else number += (5-remainder);
        return number;

    }
}
