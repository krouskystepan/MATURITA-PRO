import java.util.Scanner;

/*
Zadani:
Uživatel zadá do konzole název pracovní pozice. Vytvořte switch, ve kterém definujete tři různé pozice, pro které vypíšete libovolný text a ošetřete, že se vypíše výchozí text pro zbytek hodnot.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej pracovni pozici: ");
        String job = sc.nextLine();

        switch(job) {
            case "Pozice 1." -> System.out.println("Jsi na prvni pozici");
            case "Pozice 2." -> System.out.println("Jsi na druhe pozici");
            case "Pozice 3." -> System.out.println("Jsi na treti pozici");
            default -> System.out.println("Ty u nas nepracujes");
        }

    }
}