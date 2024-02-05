public class Car implements ICars{
    public String color;
    public String type;

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public void sound() {
        System.out.println("Brm Brm");
    }

    @Override
    public void horn() {
        System.out.println("Tut Tut");
    }
}
