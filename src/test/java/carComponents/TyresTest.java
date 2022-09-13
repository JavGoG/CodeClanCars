package carComponents;

import static org.junit.jupiter.api.Assertions.*;

class TyresTest {
    Tyres tyres;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        tyres = new Tyres(100, "All");
    }
    @org.junit.jupiter.api.Test
    void getSize() {
        assertEquals(100, tyres.getSize());
    }
    @org.junit.jupiter.api.Test
    void getSeason() {
        assertEquals("All", tyres.getSeason() );

    }
}