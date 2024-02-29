/*
Zadani:
Vytvořte návrhový vzor Factory, která bude vytvářet a vracet objekty od třídy Phones. Atributy budou na vašem uvážení
*/
public class Main {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();
        OS phone = factory.getPhone("Nokia", "cerna");
        phone.type();
    }
}