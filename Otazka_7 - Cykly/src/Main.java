import java.util.Scanner;

/*
Zadani:
Vytvořte program na výpočet Fibonacciho posloupnosti. Uživatel zadá počet čísel posloupnosti a program vypíše tuto posloupnost. (posloupnost: 0 1 1 2 3 5 8 13 21)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Zadej cislo: ");
        int num = sc.nextInt();

        int c = 0;
        int p = 1;

        for (int i = 0; i < num; i++) {
            c = c + p;
            p = c - p;

            System.out.print(p + ",");
        }
    }
}