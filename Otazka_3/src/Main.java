import java.util.Scanner;

/*
Zadani:
Uživatel zadá dvě čísla do konzole, vytvořte 4 metody pro součet, rozdíl, součin a podíl, ve kterých provedete daný výpočet. Vypište výsledek pro všechny.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej prvni cislo: ");
        double num1 = sc.nextDouble();

        System.out.print("Zadej druhe cislo: ");
        double num2 = sc.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + scitani(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + odecitani(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + nasobeni(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + deleni(num1, num2));
    }

    public static double scitani(double a, double b) {
        return (a + b);
    }
    public static double odecitani(double a, double b) {
        return (a - b);
    }
    public static double nasobeni(double a, double b) {
        return (a * b);
    }
    public static double deleni(double a, double b) {
        if (b == 0) return 0;
        return (a / b);
    }
}