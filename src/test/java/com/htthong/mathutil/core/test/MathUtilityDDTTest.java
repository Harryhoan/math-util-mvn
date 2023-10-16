/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.htthong.mathutil.core.test;

import com.htthong.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initData(){
        Object[][] dataSet = {{0,1}, 
                             {1, 1}, 
                             {2, 2}, 
                             {3, 6}, 
                             {4, 24}
                            };
        return dataSet;
    }
    
    // Hàm xài data từ nơi khác đưa đến, magr data đưa vào
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumetReturnOk(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
    
}
