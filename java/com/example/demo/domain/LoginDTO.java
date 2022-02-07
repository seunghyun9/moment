package com.example.demo.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginApp.java
 * author     : seunghyun9
 * date       : 2022-01-24
 * desc       : 아이디와 비밀번호를 받아서 로그인 하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 * 2022-01-26 김승현 PW값 정의 후 입력시 일치 불일치 결과 생성
 */

public class LoginDTO {  public static String LOGIN_TITLE="로그인앱";
    private String id;
    private String pw;
    private String name;
    public static String PASSWORD = "abc";

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPw(){
        return pw;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }









/*
    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";
        /*
        if (pw.equals(PASSWORD)){ res = String.format(" %s 님의 비밀번호 %S 가 맞습니다. 로그인 성공",this.name, this.pw);}
        else
            if (pw.equalsIgnoreCase(""));
            {res = String.format(" %s 의 아이디는 일치하고, 비밀번호 %s가 틀립니다. 로그인 실패 ",this.id, this.pw);}


        switch (pw){
            case "abc" : res = String.format(" %s 님의 비밀번호 %S 가 맞습니다. 로그인 성공",this.name, this.pw); break;
            default : res = String.format(" %s 의 아이디는 일치하고, 비밀번호 %s가 틀립니다. 로그인 실패 ",this.id, this.pw);
            break;

        }
        아래문과 세미클론이 차이가남 아래 내용은 메모리를 덜 잡아먹어 속도가 빠른 대신 참과 아닌경 우에만 사용가능함

        res = (pw.equals(PASSWORD)) ? String.format(" %s 님의 비밀번호 %S 가 맞습니다. 로그인 성공", this.name, this.pw)
                : String.format(" %s 의 아이디는 일치하고, 비밀번호 %s가 틀립니다. 로그인 실패 ", this.id, this.pw);


        return res;
    }
    */

}



