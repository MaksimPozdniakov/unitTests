package org.example.seminars.sm3;

import org.example.seminars.sm3.caverage.SomeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class SomeServiceTest {

    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void fizzTest() {
        String res = someService.fizzBuzz(3);
        assertThat(res).isEqualTo("Fizz");  // актуальное значение (первый параметр) - это значение,
                                                    // которое вычисляется методом, а второе желаемое
    }

    @Test
    void buzzTest() {
        String res = someService.fizzBuzz(5);
        assertThat(res).isEqualTo("Buzz");  // актуальное значение (первый параметр) - это значение,
                                                    // которое вычисляется методом, а второе желаемое
    }

    @Test
    void fizzBuzz() {
        String res = someService.fizzBuzz(15);
        assertThat(res).isEqualTo("FizzBuzz");  // актуальное значение (первый параметр) - это значение,
                                                        // которое вычисляется методом, а второе желаемое
    }

    @Test
    void startingSixReturnsTrue(){
        boolean res = someService.firstLast6(new int[] {6,3,1,5});
        assertTrue(res);
    }

    @Test
    void endingSixReturnsTrue(){
        boolean res = someService.firstLast6(new int[] {2,3,1,6});
        assertTrue(res);
    }

    @Test
    void bothEndsSixReturnsTrue(){
        boolean res = someService.firstLast6(new int[] {6,3,1,5,6});
        assertTrue(res);
    }

    @Test
    void noSixReturnsFalse() {
        boolean res = someService.firstLast6(new int[] {3,1,5});
        assertFalse(res);
    }

    @Test
    void emptySixReturnsFalse() {
        boolean res = someService.firstLast6(new int[] {});
        assertFalse(res);
    }

    @Test
    void nullRaisesNpe() {
        assertThatNullPointerException().isThrownBy(() -> {
            boolean res = someService.firstLast6(null);
        });

        // это можно переписать через assertThatThrowBy
    }

    // TODO дописать реализацию самого кода метода calculatingDiscount

//    /**
//     * @param i discount
//     * @param result result
//     * @apiNote Обычная скидка
//     */
//    @ParameterizedTest
//    @CsvSource({
//            "50, 1000",
//            "100, 0",
//            "0, 2000"
//    })
//    void correctDiscountCalculatingTest(int i, int result) {
//        assertThat(someService.calculatingDiscount(2000, i)).isEqualTo(result);
//    }
//
//    /**
//     * @param i
//     * @apiNote Некорректная скидка
//     */
//    @ParameterizedTest
//    @ValueSource(ints = {101, -1})
//    void incorrectDiscountValue(int i) {
//        assertThatThrownBy(() -> someService.calculatingDiscount(2000, i))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
//    }
//
//
//    @Test
//    void incorrectPurchaseAmount() {
//        assertThatThrownBy(() -> someService.calculatingDiscount(-1, 10))
//                .isInstanceOf(ArithmeticException.class)
//                .hasMessage("Сумма покупки не может быть отрицательной");
//    }

    // TODO дописать логику тестов luckySum



}
