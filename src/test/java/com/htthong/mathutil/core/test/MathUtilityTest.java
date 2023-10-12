/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.htthong.mathutil.core.test;

import com.htthong.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {

    //Test case template/Structure:
    //ID | DESC | STEP/PROCEDURES | EXPECTED VALUE | STATUS (PASSED/FAILED)
    //Test case #1: Verify the getFatorial() function with  n = 0;
    //Step/procedures:
    //          1. Given n = 0
    //          2. Call/invoke getFactorial(int n)
    //Expected Result
    //          The method getFactorial(n = 0) must return 1
    //                      as the result of the 0! == 1
    //Status: PASSED/FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/METHOD
    @Test  //Dính đến thuật ngữ FRAMEWORK
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    //Test case #1: Verify the getFatorial() function with  n = 0;
    @Test  //Dính đến thuật ngữ FRAMEWORK
    public void verifyFactorialGivenRightArgument6ReturnsOk() {
        assertEquals(720, MathUtility.getFactorial(6));
    }
    public void verifyFactorialGivenRightArgument20ReturnsOk() {
        assertEquals("Invalid input. n must be between 0 and 20", MathUtility.getFactorial(20));
    }

}
