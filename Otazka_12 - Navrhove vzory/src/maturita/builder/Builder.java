package maturita.builder;

public class Builder {

    private String brand;
    private String model;

    public Builder setBrand(String brand) {
        this.brand = brand;
        return this; //u každé metody musíme vracet daný objekt (return this)
    }

    public Builder setModel(String model) {
        this.model = model;
        return this;
    }

    public Car build() { //metoda nám ze zadaných hodnot vytvoří celý objekt
        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        return car;
    }
}
