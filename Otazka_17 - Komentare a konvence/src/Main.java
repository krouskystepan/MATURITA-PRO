/*
Zadani:
Vytvořte třídu Books. Tato třída bude mít atributy pro název knihy, rok vydání a jméno autora. Vytvořte konstruktor, gettery a settery. V hlavní třídě vytvořte dva objekty od této třídy a vypište jeden jejich atribut. Celý projekt zdokumentujte pomocí JavaDoc a vygenerujte dokumentaci.
*/

/**
 * Třída Main slouží jako vstupní bod programu.
 *
 * @author stepankrousky
 */
public class Main {
    /**
     * Metoda main je vstupní bod programu.
     * Vytváří instance třídy Book a vypisuje autory knih.
     *
     * @param args Příkazové řádkové argumenty
     */
    public static void main(String[] args) {
        Book book1 = new Book("Kniha 1.", 2016, "Urban");
        Book book2 = new Book("Kniha 2.", 2020, "Till");

        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());
    }
}