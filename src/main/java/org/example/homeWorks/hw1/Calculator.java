package org.example.homeWorks.hw1;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

/**
    Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    Примерная сигнатура и тело метода:
*/

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double discount = (double) discountAmount / 100; // Преобразуем размер скидки в десятичную дробь
        return purchaseAmount - (purchaseAmount * discount); // Возвращаем сумму с учетом скидки
    }
}