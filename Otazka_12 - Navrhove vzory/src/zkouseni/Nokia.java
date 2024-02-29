public class Nokia implements OS{
    private final String color;

    public Nokia(String color) {
        this.color = color;
    }

    @Override
    public void type() {
        System.out.println("Nokia mobil pro socky v barve: " + color);
    }
}
