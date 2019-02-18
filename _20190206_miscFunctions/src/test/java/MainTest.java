import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static final double DELTA = 0.01;

    @org.junit.jupiter.api.Test
    void lbToKg() {
        assertEquals(0.453592,Main.lbToKg(1.0), DELTA);
        assertEquals(0, Main.lbToKg(0.0), DELTA);
        assertEquals(-0.4535, Main.lbToKg(-1.0),DELTA);
        assertEquals(3.773889, Main.lbToKg(8.32),DELTA);
        assertEquals(4.53592, Main.lbToKg(10.0),DELTA);
        assertEquals(13.29026, Main.lbToKg(29.3), DELTA);
  }

    @org.junit.jupiter.api.Test
    void catToString() {
        assertEquals("Rex 1.0 pounds, or 0.5 kg",Main.catToString("Rex", 1.0));
    }
}