package com.example.demo.bmi;

import com.example.App.bmi.BmiApp;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class BmiDemo {
    public static String excute(String name, int cm, int kg) {
        BmiApp bmiApp = new BmiApp();

        return bmiApp.getbmi(name,cm,kg);


    }



        }



