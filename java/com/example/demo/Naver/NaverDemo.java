package com.example.demo.Naver;

import java.util.Scanner;

/**
 * packageName: com.example.demo.Naver
 * fileName   : NaverDemo
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        NaverApp n = new NaverApp();
        Scanner s = new Scanner(System.in);

        System.out.println(NaverApp.Naver);

        System.out.println("ID를 입력하시오");
        String id = s.next();

        System.out.println("PW를 입력하시오");
        String pw = s.next();

        String res = n.naver2(id,pw);
        System.out.println(res);



    }
}
