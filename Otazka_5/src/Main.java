/*
Zadani:
Uživatel zadá číslo do konzole. Program vypíše, zda je číslo menší než 20, mezi 20 a 30, větší než 30.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej cislo: ");
        double input = sc.nextDouble();

        if(input < 20) {
            System.out.println("Cislo je mensi nez 20");
        } else if (input >= 20 && input <= 30) {
            System.out.println("Cislo je mezi 20 a 30");
        } else {
            System.out.println("Cislo je vetsi nez 30");
        }
    }
}