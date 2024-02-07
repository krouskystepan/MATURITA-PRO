import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Zadani:
Uživatel zadá 5 textů do konzole. Tyto texty uložte do textového souboru.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(FileWriter writer = new FileWriter("src/text.txt")) {

            for (int i = 1; i <= 5; i++) {
                System.out.print("Zadej " + i + " slovo: ");
                writer.write(sc.nextLine() + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}