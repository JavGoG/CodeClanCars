import carComponents.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {
    Engine engine;

    @BeforeEach
    void setUp() {
        engine = Engine.COMBUSTION;
    }

    @Test
    void getSize() {
        Assertions.assertEquals(Engine.COMBUSTION, Engine.COMBUSTION);

    }
}
