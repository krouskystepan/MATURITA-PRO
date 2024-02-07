import java.util.HashMap;

/*
Zadani:
Vytvořte třídu Film, ve které budou atributy pro název filmu, rok vydání, žánr. Vytvořte konstruktor, gettery a settery. V hlavní třídě vytvořte 5 objektů od této třídy a uložte je do HashMapy s klíčem ID a hodnotou daného objektu. ID automaticky přičítejte od 0. Po vyplnění kolekce vypište všechny klíče a hodnoty do konzole.
*/
public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Film c.1", 1999, "Komedie");
        Film film2 = new Film("Film c.2", 2003, "Dokument");
        Film film3 = new Film("Film c.3", 2020, "Fantasy");
        Film film4 = new Film("Film c.4", 2022, "Horor");
        Film film5 = new Film("Film c.5", 2000, "Thriller");

        HashMap<Integer, Film> map = new HashMap<>();
        map.put(0, film1);
        map.put(1, film2);
        map.put(2, film3);
        map.put(3, film4);
        map.put(4, film5);

        for (Integer id : map.keySet()) {
            System.out.println(id + " " + map.get(id));
        }
    }
}