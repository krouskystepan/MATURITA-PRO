package maturita;

public class Singleton {

    private static Singleton instance; //jedna jediná instance od Singleton třídy

    private Singleton() {}

    public static Singleton getInstance() { //getter pro získání instance, pokud instance neexistuje, vytvoříme ji
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
