package com.company;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmecticalActionsTest {
    private final ArithmecticalActions arithmecticalActions = new ArithmecticalActions();
    @Test
    public void sumOfTwoNumbersTest() {
        int firstNumber = 2;
        int secondNumber = 4;
        int expectedResult = 6;
        int actualResult = arithmecticalActions.sumOfTwoNumbers(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, "Number is not correct");
    }
    @Test
    public void divisionOfTwoNumbersTest(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        int actualResult = arithmecticalActions.divisionOfTwoNumbers(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, "Number is not correct");
        Assert.assertTrue(actualResult < 0, "Number is less then zero");
    }
}