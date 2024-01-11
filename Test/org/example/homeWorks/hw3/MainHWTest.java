package org.example.homeWorks.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void evenNumber() {
        assertTrue(mainHW.evenOddNumber(2));
    }

    @Test
    void oddNumber() {
        assertFalse(mainHW.evenOddNumber(3));
    }


    @Test
    void numberInInterval() {
        assertTrue(mainHW.numberInInterval(26));
    }

    @Test
    void numberOutsideInterval() {
        assertFalse(mainHW.numberInInterval(5));
    }
}