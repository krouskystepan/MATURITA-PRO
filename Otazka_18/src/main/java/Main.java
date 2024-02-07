import java.sql.SQLException;

/*
Zadani:
18.	Vytvořte třídu pro práci s databází. V této třídě vytvořte metodu pro připojení k databázi, kterou vyvoláte po spuštění programu. Vytvořte metodu pro výpis z tabulky, metodu pro vložení dat do tabulky. Vytvořte na serveru databázi a tabulku, která bude mít alespoň tři sloupce. Podle této tabulky vytvořte v Javě příkazy pro práci s databází a ověřte funkčnost.

Postup:
XAMPP: V:\Vyuka_IT\WEB_APLIKACE
1. Extrahujeme na plochu
2. Pustime setup_xampp.bat
3. Pustime xampp_control.exe
4. Startneme apache a mysql
5. Klikneme na mysql admin

phpMyAdmin
1. Vytvorime DB s nazvem test
2. V ni tabulku users
3. Sloupce
    - id int AUTO_INCREMENT
    - firstName VARCHAR 64
    - lastName VARCHAR 64
    - age int

-----
1. Zkusime to tady pustit
2. Pokud tady nemame chybu, tak bychom meli v DB mit zapis
*/
public class Main {

    public static void main(String[] args) {
        try {
            DatabaseManager.setData("Stepan", "Krousky", 19);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
