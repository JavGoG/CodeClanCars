package vehicleTypes;

import carComponents.Engine;

public class Electric {
    private int price;
    private String colour;
    private Engine engine;

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Electric(int price, String colour, Engine engine) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }
}
