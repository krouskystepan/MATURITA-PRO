public class Animals {
    private String name;
    private int age;
    private int height;

    public void makeSound() {
        System.out.println("Zvuk zvirete");
    }

    public Animals(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
