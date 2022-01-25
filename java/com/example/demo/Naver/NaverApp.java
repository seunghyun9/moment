package com.example.demo.Naver;

/**
 * packageName: com.example.demo.Naver
 * fileName   : NaverApp
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * 클래스변수   : Naver
 * 파라미터, 인스턴트변수 : ID PW
 * 로컬변수     : res 값
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class NaverApp {
    static String Naver = "Naver";
    String id;
    String pw;

    public String naver2(String id, String pw){
        this.id = id;
        this.pw = pw;

        return String.format("ID: %S, PW: %s", this.id,this.pw);




    }

}
