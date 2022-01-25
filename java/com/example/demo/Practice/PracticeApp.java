package com.example.demo.Practice;

/***
 *  내이름은 XX다.
 *  나이는 XX살이며
 *  만나이는 XX살이다.
 */


public class PracticeApp {
    String name;
    int num1;

    public String practice(String name, int num1){
        this.name = name;
        this.num1 = num1;

        return String.format("내이름은 %s이며 만나이는 %d이다.",this.name, this.num1-1);

    }



    }

