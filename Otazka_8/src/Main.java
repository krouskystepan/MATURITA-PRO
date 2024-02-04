import java.util.Arrays;
import java.util.Scanner;

/*
Zadani:
Uživatel zadá do konzole 5 čísel, která uložíte do pole. Program z tohoto pole vypíše nejmenší číslo, největší číslo a průměr těchto čísel.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] nums = new Integer[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Zadej " + (i + 1) + " cislo: ");
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.println("Nejmensi cislo je: " + nums[0]);
        System.out.println("Nejvetsi cislo je: " + nums[nums.length - 1]);
        System.out.println("Prumer cisel je: " + ((nums[0] + nums[nums.length - 1]) / 2));
    }
}