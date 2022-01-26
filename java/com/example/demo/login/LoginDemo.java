package com.example.demo.login;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginDemo.java
 * author     : seunghyun9
 * date       : 2022-01-24
 * desc       : LoginApp 을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 *
 */

public class LoginDemo {

    public static void main(String[] args){
        LoginApp loginApp =  new LoginApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println(loginApp.LOGIN_TITLE);

        System.out.println("이름을 입력하시오");
        String name = scanner.next();

        System.out.println("아이디를 입력하시오");
        String id = scanner.next();

        System.out.println("비밀번호를 입력하시오");
        String pw  = scanner.next();

        String res = loginApp.login(id, pw, name);
        System.out.println(res);


    }

}
