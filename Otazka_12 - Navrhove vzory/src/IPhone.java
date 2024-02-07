public class IPhone implements OS{
    private final String color;

    public IPhone(String color) {
        this.color = color;
    }

    @Override
    public void type() {
        System.out.println("iPhone pro nesocky v barve: " + color);
    }
}
