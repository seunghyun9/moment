package com.example.demo.Google;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Google
 * fileName   : GoogleDemo
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        GoogleApp g = new GoogleApp();
        Scanner s = new Scanner(System.in);

        System.out.println("search 입력");
        String search = s.next();

        String result = g.google(search);
        System.out.println(result);



    }


    }

