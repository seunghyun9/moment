package com.example.demo.kakao;

import com.example.demo.login.LoginApp;

import java.util.Scanner;
import com.example.demo.kakao.KakaoApp;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoDemo.java
 * author     : seunghyun9
 * date       : 2022-01-24
 * desc       : KakaoApp을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 *
 */

public class KaKaoDemo {
    public static void main(String[] args){
        KakaoApp kakaoApp =  new KakaoApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("보내실 전화번호를 입력하시오");
        String telno = scanner.next();

        System.out.println("전달 할 메시지를 입력하시오");
        String message = scanner.next();

        String res = kakaoApp.k2(telno,message);
        System.out.println(res);




    }
}
