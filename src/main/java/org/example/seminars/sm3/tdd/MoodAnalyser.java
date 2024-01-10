package org.example.seminars.sm3.tdd;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("прекрасный")) return "GoodMood";
        if (message.contains("обычный")) return "NormalMood";
        if (message.contains("плохой")) return "BadMood";
        else return "";
    }
}
