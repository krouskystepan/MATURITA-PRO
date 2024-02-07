public enum Planets {
    MERCURY("Small"),
    VENUS("Medium"),
    EARTH("Medium"),
    MARS("Small"),
    JUPITER("Large"),
    SATURN("Large"),
    URANUS("Medium"),
    NEPTUNE("Medium");

    private final String size;

    Planets(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
