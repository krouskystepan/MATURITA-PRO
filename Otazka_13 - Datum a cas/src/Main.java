import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Zadani:
Získejte aktuální systémový čas a zformátujte ho následovně: den.měsíc.rok hodiny:minuty:sekundy
*/
public class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));
    }
}