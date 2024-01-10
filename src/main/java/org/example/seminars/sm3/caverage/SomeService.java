package org.example.seminars.sm3.caverage;

public class SomeService {

    public String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return null;
    }

    public boolean firstLast6(int[] nums) {
        if (nums.length == 0) return false;
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    // TODO дописать реализацию метода calculatingDiscount
    void calculatingDiscount() {}

    // TODO дописать логику тестов
    public static int luckySum(int a, int b, int c) {
        int[] number = new int[] {a, b, c};
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 13) {
                result += number[i];
            }
        }
        return result;
    }



}
