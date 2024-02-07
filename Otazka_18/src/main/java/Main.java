import java.sql.SQLException;

/*
Zadani:


Postup:
XAMPP: V:\Vyuka_IT\WEB_APLIKACE
1. Extrahujeme na plochu
2. Pustime setup_xampp.bat
3. Pustime xampp.control.exe
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
