package com.example.demo.Google;

/**
 * packageName: com.example.demo.Google
 * fileName   : GoogleApp
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * 클래스변수   : Goo
 * 파라미터, 인스턴트변수 : search
 * 로컬변수     : res 값
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class GoogleApp {

    public static String Google_TITle = "Google";
    private  String search;
    public String google(String search){
        this.search = search;
        String result = String.format (" %s의 결과값 출력 ", this.search);
        return result;


    }





}
