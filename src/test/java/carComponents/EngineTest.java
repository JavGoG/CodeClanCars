package carComponents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {
    Engine engine;
    @BeforeEach
    void setUp() {
        engine = new Engine(1998.8, "Diesel");
    }
    @Test
    void getSize() {
        assertEquals(1998.8, engine.getSize());
    }
    @Test
    void getType() {
        assertEquals("Diesel", engine.getType());
    }
}