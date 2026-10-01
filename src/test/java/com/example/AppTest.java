package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testMessage() {
        App app = new App();
        assertEquals("Hello from Java Web Application!", app.home());
    }
}