package com.example.demo.hello;

import java.util.Scanner;

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
