package org.example.homeWorks.hw1;

import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        allValuesValid();
        incorrectPurchaseAmount();
        incorrectDiscount();
    }

    public static void allValuesValid() {
        double purchaseAmount = 100.0;
        int discountAmount = 10;
        double result = Calculator.calculatingDiscount(purchaseAmount, discountAmount);
        assertThat(result).isEqualTo(90.0);
    }

    public static void incorrectPurchaseAmount() {
        double purchaseAmount = -100.0;
        int discountAmount = 20;
        double result = Calculator.calculatingDiscount(purchaseAmount, discountAmount);
        assertThat(result).isEqualTo(0.0);
    }

    public static void incorrectDiscount() {
        double purchaseAmount = 200.0;
        int discountAmount = 120;
        double result = Calculator.calculatingDiscount(purchaseAmount, discountAmount);
        assertThat(result).isEqualTo(purchaseAmount);
    }
}


