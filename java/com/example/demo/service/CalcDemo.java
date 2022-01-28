package com.example.demo.service;

import com.example.demo.domain.CalcApp;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcDemo.java
 * author     : seunghyun9
 * date       : 2022-01-24
 * desc       : CalcApp 을 실행시켜주는 데모
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 *
 */

public class CalcDemo {
    public static String excute(int num1, String opcode, int num2){
        CalcApp calcApp = new CalcApp();

        return calcApp.calc(num1, opcode, num2);






    }
}
