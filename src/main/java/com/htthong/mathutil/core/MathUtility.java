/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.htthong.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    public static final double PI=3.14;
        //public const double PI=3.14: //C# ko cần static mà vẫn giống
                                       //vì có chữ const ~ final
        //Hàm tính n! = 1.2.3...n
        //0! = 1! = 1 - quy ước
        //ko tính đc giai thừa số âm
        //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
        //vậy 21! ko chứa trong long đc, tràn kiểu dữ liệu
        //quy ước < 0 ! và > 20! NÉM NGOẠI LỆ 
    
        //5! = 1*2*3*4*5
        //5! =       4! * 5 = 5 * 4!
        //4! = 1*2*3*4
        //3! = 3*2!
        //3! * 4 = 4 * 3!
        //2! = 3*2!
        //2! = 2*1!
        //N! = N X (N - 1) Đệ quy gọi là chính mình với quy mô nhỏ hơn Búp bê Nga
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid input. n must be between 0 and 20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    
    public static long getFactorial(int n) {  //n!
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid input. n must be between 0 and 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //Dùng đệ quy
        return n*getFactorial(n-1);
    }
    //Kĩ thuật kiểm thử gọi là: REGRESSION TESTING
    //                          Kiểm thử hồi quy - TEST lại những thứ đã từng test
    //Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa vì:
    //  Fix bug thì phải sửa code, sửa hàm
    //  Thêm hàm, thêm tính năng
    //  Tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
    //  Hàm đang ngon - màu xanh, nếu ta sửa hàm vì lí do gì đó
    //  Liệu rằng hàm còn xanh hay ko, thì phải test lại
    //  Nếu test - tay, bằng log, thì cực kì tốn tgian, mất sức
    
    //  Nếu code của ta có sẵn test script - code kiểm thử
    //  Ta chỉ việc run lại cái test script này
    //  Nếu test script ta verify lại 1 hàm rất nhanh -> kiểm thử lại
    //  Thứ đã từng kiểm thử để đảm bảo nó còn ngon so với trc
    //  Khi sửa đc gọi là kiểm thử hồi quy = cách sảuw lại hàm theo thuật toán
    //  Đệ quy - recursion
}