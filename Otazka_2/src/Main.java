import java.util.Scanner;

/*
Zadani:
Popis prostředí. Java – uživatel zadá text do konzole a vypište, kolik znaků daný text měl.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej nejaky text: ");
        String input = sc.nextLine();
        System.out.println("Dany text je " + input.trim().length() + " znaku dlouhy");
    }
}