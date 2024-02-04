import java.util.Arrays;
import java.util.Scanner;

/*
Zadani:
Vytvořte algoritmus, který seřadí pole pěti čísel od nejmenšího po největší. Tato čísla zadá uživatel do konzole.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vytvorime pole s velikosti 5
        Integer[] numbers = new Integer[5];

        // Cyklus na zadani cisel od uzivatele
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Zadej " + (i + 1) + ". cislo: ");
            numbers[i] = sc.nextInt();
        }

        // Srovname pole s cislama
        Arrays.sort(numbers);

        // Vypiseme cisla od uzivztele do konzole
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
    }
}