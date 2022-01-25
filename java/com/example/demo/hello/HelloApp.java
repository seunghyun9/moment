package com.example.demo.hello;
/***
 *  나는 홍길동이고 12살이야
 */


public class HelloApp {
    static String Hello = "헬로우 어플";
    String name;
    int age;

    public String hello(String name, int age){
        this.name =name;
        this.age = age;
        return String.format("안녕 내이름은 %s 이고 %d 살이야", this.name, this.age);

    }
}
