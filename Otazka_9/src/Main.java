/*
Zadani:
Vytvořte třídu Animals, která bude obsahovat atributy name, age, height a makeSound s výchozím zvukem. Vytvořte třídu Dog, která bude dědit třídu Animals. V této třídě vytvořte stejně atributy a stejnou metodu. Hodnoty atribut předávejte v konstruktoru. V hlavní třídě vytvořte dva objekty od třídy Dog, prověďte výpis jednoho atributu a vyvolejte metodu makeSound.
*/
public class Main {
    public static void main(String[] args) {
        Dog pes1 = new Dog("Alik", 22, 60);
        Dog pes2 = new Dog("Alex", 12, 40);

        System.out.println(pes1.name);
        pes2.makeSound();
    }
}