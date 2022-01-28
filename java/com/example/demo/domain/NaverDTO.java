package com.example.demo.domain;

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
public class NaverDTO {
    static String Naver = "Naver";

    private String id;
    private String pw;

    public String getID(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }


    public String getPw(){
        return id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}



    /*
    String id;
    String pw;

    public String naver2(String id, String pw){
        this.id = id;
        this.pw = pw;

        return String.format("ID: %S, PW: %s", this.id,this.pw);

     */






