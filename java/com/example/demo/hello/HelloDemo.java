package com.example.demo.hello;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : text
 * author     : HelloDemo.java
 * date       : 2022-01-24
 * desc       : helloApp 을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 *
 */

public class HelloDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();

        System.out.println(HelloApp.Hello);

        System.out.println("name");
        String name = scanner.next();

        System.out.println("age");
        int age = scanner.nextInt();

        String res = helloApp.hello(name, age);
        System.out.println(res);



    }
}
