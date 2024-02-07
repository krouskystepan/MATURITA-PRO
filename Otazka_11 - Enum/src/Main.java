/*
Zadani:
Vytvořte Enum s názvem Planets. Vytvořte atribut pro velikost planet, vytvořte konstruktor a do každé planety doplňte jeho velikost. Vytvořte getter pro získání velikosti planet. V hlavní třídě vytvořte proměnnou pro tento Enum a vyzkoušejte vypisování velikosti do konzole.
*/
public class Main {
    public static void main(String[] args) {
        Planets planet = Planets.MERCURY;
        System.out.println(planet.getSize());
    }
}