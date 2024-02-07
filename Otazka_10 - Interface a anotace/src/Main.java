/*
Zadani:
Vytvořte rozhraní ICars, ve které vytvoříte metody pro sound a horn. Vytvořte třídu Car, ve které budou atributy color a type. Tato třída bude implementovat vytvořené rozhraní a doplňte těla těchto metod. Ověřte funkčnost vytvořením objektu a vyvoláním metod.
*/
public class Main {
    public static void main(String[] args) {
        Car car = new Car("black", "Audi");
        car.sound();
        car.horn();
    }
}