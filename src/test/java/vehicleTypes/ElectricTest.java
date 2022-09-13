package vehicleTypes;

import carComponents.Engine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricTest {
    Electric electric;
    @BeforeEach
    void setUp() {
        electric = new Electric(10000, "White", Engine.ELECTRIC);
    }

    @Test
    void getPrice() {
    }

    @Test
    void getColour() {
    }

    @Test
    void getEngine() {
    }
}