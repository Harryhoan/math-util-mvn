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

    // 3 Test case trên ko đẹp, bốc mùi(Bad Smell), vì chỉ khác nhau phần data
    // Trong nghề kiểm thử có 1 kĩ thuật đó là tách hẳn data kiểm thử ra
    // 1 chỗ cho dễ nhìn, dễ quả đc data thiếu đủ hay ko
    
    // Sau đó ta đưa bộ data này vào trong câu lệnh so sánh ASSERT()
    // Qua các tham số (PARAMETER)
    // Tức là AssertEquals(Expected, Actual) là 2 tham số
    // Ứng với bộ data đc tách ra
    //                          120         5!
    //                          720         6!
    //                          24          4!
    //                          6           3!
    //                          2           2!
    //                          ...
    
    //                      MẢNG [4] [2] {0, 1} {2, 2} {3,6} {5, 120}
    // Code nhìn gọn, phát hiện đc thiếu đủ test data, test case
    // Kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh -> đc gọi
    // Là DDT - data driven testing - kiểm thử theo hướng tách data riêng rẽ
}
