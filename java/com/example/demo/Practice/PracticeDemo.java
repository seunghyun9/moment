package com.example.demo.Practice;


import java.util.Scanner;

public class PracticeDemo {
    public static void main(String[] args) {
        PracticeApp practice = new PracticeApp();
        Scanner s = new Scanner(System.in);

        System.out.println("이름이 뭔가 ");
        String name = s.next();

        System.out.println("나이가 몇살인가");
        int num1 = s.nextInt();

        String res = practice.practice(name,num1);
        System.out.println(res);
    }

    }
