import java.sql.*;

public class DatabaseManager {

    public static void getData() throws SQLException {
        /*
        Prvním krokem je vytvoření připojení. Deklarace připojení je pomocí Connection a konkrétně ho vytváříme pomocí DriverManager.getConnection()
        Příkaz pro připojení je nutno si pamatovat!
        jdbc:mysql://adresa_serveru:port_serveru/nazev_databaze
        user: přihlašovací jméno, v xamppu root
        password: heslo, v xamppu není nastaveno
         */
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
        /*
        Pro vykonání příkazu potřebujeme vytvořit PreparedStatement
        V inicializaci použijeme vytvořeme připojení a připravíme statement
        Do závorky píšeme SQL příkaz
         */
        PreparedStatement statement = c.prepareStatement("SELECT * FROM zoo");
        /*
        Pokud používáme příkaz, který nám vrací nějaký data, potřebujeme použít ResultSet, abychom mohli s těmito daty pracovat
        Ze statementu vyvoláme executeQuery()
         */
        ResultSet set = statement.executeQuery();
        /*
        V případě ResultSetu vytvoříme while s podmínkou set.next(), který nejen kontroluje, zda tato kolekce má nějaká další data, ale zároveň se aktuálně používaná data posouvají
         */
        while (set.next()) {
            /*
            Z ResultSetu můžeme používat celou řadu metod pro získání konkrétní hodnoty
            Do závorek píšeme název sloupce databáze
             */
            System.out.println(set.getString("column1"));
            System.out.println(set.getInt("column2"));
            System.out.println(set.getString("column3"));
        }
    }

    public static void setData(String val1, int val2, String val3) throws SQLException{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");
        /*
        Pokud do příkazu dosazujeme konkrétní data, nedáváme je přímo do prepareStatement, ale nahradíme daná místa otazníky a konkrétní hodnoty dosadíme na dalších řádcích
         */
        PreparedStatement statement = c.prepareStatement("INSERT INTO zoo VALUES (NULL,?,?,?)");
        /*
        Pomocí metod setString, setInt, ... dosazujeme konkrétní hodnoty za otazníky v příkazu. Indexace od 1
         */
        statement.setString(1, val1);
        statement.setInt(2, val2);
        statement.setString(3, val3);
        statement.execute(); //Nevracíme žádná data, se kterýma chceme pracovat, proto dáme pouze execute
    }
}
