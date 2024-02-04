public class Animals {
    public String name;
    public int age;
    public int height;

    public void makeSound() {
        System.out.println("Zvuk zvirete");
    }

    public Animals(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
