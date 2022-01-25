package com.example.demo.login;
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
 *
 */
import java.util.Scanner;

public class LoginApp {
    String id;
    String pw;
    String name;

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format(" ID : %s, PW : %s, Name : %s", this.id, this.pw, this.name);

    }

}
