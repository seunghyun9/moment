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
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BmiApp b = new BmiApp();

        System.out.println(BmiApp.BMI);

        System.out.println("이름이 무엇입니까");
        String name = s.next();

        System.out.println("키를 입력하시오");
        int cm = s.nextInt();

        System.out.println("몸무게를 입력하시오");
        int kg  = s.nextInt();

        String res = b.bmi(name,cm,kg);
        System.out.println(res);


    }



        }



