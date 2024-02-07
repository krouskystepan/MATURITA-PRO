import java.util.Scanner;

/*
Zadani:
Uživatel zadá do konzole 4 různé texty. Tyto texty spojte do jedné proměnné a tuto proměnnou vypište. Mezi texty musí být tečky.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Zadej " + (i + 1) + " slovo: ");
            arr[i] = sc.nextLine();
        }

        String text = "";
        for (String word : arr) {
            text += word + " . ";
        }

        System.out.println(text);
    }
}