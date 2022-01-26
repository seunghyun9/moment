package com.example.demo.kakao;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoApp.java
 * author     : seunghyun9
 * date       : 2022-01-24
 * desc       : 전화번호와 메시지를 받아서 전송하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 *
 */

public class KakaoApp {
    String telno;
    String message;

    public String k2(String telno, String message){
        this.telno = telno;
        this.message = message;

        return String.format("%s 에게 %s 전송합니다.",this.telno,this.message);
    }

}
