import java.sql.SQLException;

/*
Zadani:


Postup:
XAMPP: V:\Vyuka_IT\WEB_APLIKACE
1. Extrahujeme na plochu
2. Pustime setup_xampp.bat
3. 
*/
public class Main {

    public static void main(String[] args) {
        try {
            DatabaseManager.setData("jjj", 44, "white");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
