import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            DatabaseManager.setData("jjj", 44, "white");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
