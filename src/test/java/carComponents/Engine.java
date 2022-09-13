package carComponents;

public class Engine {
    private final double size;
    private final String type;

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public Engine(double size, String type) {
        this.size = size;
        this.type = type;
    }
}
