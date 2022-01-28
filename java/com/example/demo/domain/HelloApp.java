package com.example.demo.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : HelloApp.java
 * author     : seunghyun9
 * date       : 2022-01-24
 * desc       : 이름과 나이를 받아서 인사말을 출력하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 *
 */


public class HelloApp {
    static String Hello2 = "헬로우 어플";
    String name;
    int age;

    public String hello(String name, int age){
        this.name =name;
        this.age = age;
        return String.format("안녕 내이름은 %s 이고 %d 살이야", this.name, this.age);

    }
}
