package com.example.app;

import com.example.app.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue(true); // Example test
    }

    // Test the add function
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void twoPlusTwoEqualsFour() {
        App app = new App();
        assertEquals(4, app.add(2, 2), "2 + 3 should equal 5");
    }

}
