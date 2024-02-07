import java.util.InputMismatchException;
import java.util.Scanner;

/*
Zadani:
Vytvořte program, kde uživatel zadá dvě čísla a program vypíše výsledek pro součet a součin. Celý program ošetřete, aby se po vyhození chyby nevypnul.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Zadej 1 cislo: ");
            int num1 = sc.nextInt();
            System.out.print("Zadej 2 cislo: ");
            int num2 = sc.nextInt();

            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } catch (InputMismatchException e) {
            System.out.println("Zadal jsi neco asi spatne!");
        }
    }
}