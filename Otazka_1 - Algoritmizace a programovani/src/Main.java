import java.util.Arrays;
import java.util.Scanner;

/*
Zadani:
Vytvořte algoritmus, který seřadí pole pěti čísel od nejmenšího po největší. Tato čísla zadá uživatel do konzole.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] numbers = new Integer[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Zadej " + (i + 1) + ". cislo: ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.print(num + ", ");
        }
    }
}