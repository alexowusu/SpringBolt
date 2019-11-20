package io.turtabl.SpringWeb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    @Test
    void add() {
        Maths results = new Maths();
        assertEquals(5,1,4);
    }

    @Test
    void sub() {
        Maths results = new Maths();
        assertEquals(3,5,2);
    }
}