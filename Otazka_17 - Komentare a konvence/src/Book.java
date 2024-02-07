/**
 * Tahle trida je pro jednodusi vytvareni knih.
 *
 * @author stepankrousky
 */
public class Book {
    private String name;
    private int year;
    private String author;

    /**
     * Ziska jmeno knihy
     * @return Jmeno knihy
     */
    public String getName() {
        return name;
    }

    /**
     * Nastavi jmeno knihy
     * @param name Jmeno knihy
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ziska rok vydani
     * @return Rok vydani
     */
    public int getYear() {
        return year;
    }

    /**
     * Nastavi rok vydani
     * @param year Rok vydani
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Ziska autora knihy
     * @return Autor knihy
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Nastavi autora knihy
     * @param author Autor knihy
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Konstruktor pro vytvoreni knihy
     * @param name Jmeno knihy
     * @param year Rok vydani
     * @param author Autor knihy
     */
    public Book(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }
}
