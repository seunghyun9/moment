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
    public static String excute(String search ) {
        GoogleApp googleApp = new GoogleApp();

        return googleApp.google(search);


    }


    }

