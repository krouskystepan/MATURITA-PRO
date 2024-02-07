public class Samsung implements OS{
    private final String color;

    public Samsung(String color) {
        this.color = color;
    }

    @Override
    public void type() {
        System.out.println("Samsung mobil pro stredni socky v barve: " + color);
    }
}
