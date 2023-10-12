package com.htthong.mathutil.main;

import com.htthong.mathutil.core.MathUtility;

public class Main {

    public static void main(String[] args) {
        //TEST CASE #1: - CHI TIẾT BÊN DƯỚI
        int n = 0; //given n = 0, ý là muốn tính 0!
        long expected = 1; // ý muốn là hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); ///ý muốn nói rnagf hàm chạy ra mấy, invoke, call
        
        //so sánh giữa expected vs actual
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
        //TEST CASE #2: - CHI TIẾT BÊN DƯỚI
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
        //TEST CASE #3: N = 5 - CHI TIẾT BÊN DƯỚI
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
    }
    
}
//TEST CASE 2: Verify getFactorial(with n = 1)
//STEP/PROCEDURES:
//              1. Give n = 1
//              2. Call/invoke getFactorial(n = 1)
//EXPECTED RESULT:
//                  the method must return 1 in case of 1!
//STATUS: PASSED | FAILED

//TEST CASE 3: Verify getFactorial(with n = 5)
//STEP/PROCEDURES:
//              1. Give n = 1
//              2. Call/invoke getFactorial(n = 5)
//EXPECTED RESULT:
//                  the method must return 1 in case of 1!
//STATUS: PASSED | FAILED



//MÌNH LÀ DEV MÌNH PHẢI TEST CODE CỦA MÌNH NGON TRC ĐÃ
//MUỐN TEST CODE (DEV) HAY TEST APP (QC/TESTER) THÌ CẦN PHẢI CHUẨN BỊ 
//TEST CASE - HUỐNG KIỂM THỬ, TRƯỜNG HỢP KIỂM THỬ - CÁCH TA
//          KIỂM THỬ TRONG 1 NGỮ CẢNH NÀO ĐÓ - BÀN VỀ BỘ DATA
//1 TESR CASE CÓ CÙNG CẤU TRÚC DỮ LIỆU  như sau:
//ID / Discription | steps/Procedures | Excepted Result | Status (Passed/

//  dev em muốn kiểm thử coi hàm chính EM VIẾT getFactorial() đúng hay sai
//thì e Phải thiết kế các test case

//Test case #1: Verify getFatorial(with n = 0);
//Steps-Procedures:         [Các bước run app để test]
//          1. Given n = 0;
//          2. Execute/Call/Invoke function getFactorial(0)

//Expected Result: the function must return 1 (standing for 0! = 1)
//Status: PASSED, or FAILED, ai biết, chờ run app/hàm cái đã!!


//RUN HÀM, RUN APP, ĐƯA TEST VÀO, ĐC GỌI LÀ TEST RUN