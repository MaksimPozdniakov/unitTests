package org.example.seminars.sm3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    MoodAnalyser moodAnalyser;

    @BeforeEach
    void setUp() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    void analyseGoodMood() {
        String res = moodAnalyser.analyseMood("Какой прекрасный день");
        assertEquals("GoodMood", res);
    }

    @Test
    void analyseNormalMood() {
        String res = moodAnalyser.analyseMood("Какой обычный день");
        assertEquals("NormalMood", res);
    }

    @Test
    void analyseBadMood() {
        String res = moodAnalyser.analyseMood("Какой плохой день");
        assertEquals("BadMood", res);
    }
}