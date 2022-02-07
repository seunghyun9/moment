package com.example.demo.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : seunghyun9
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seunghyun9    최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{
    @Override
    public void dice(Scanner scanner) {

        String s = "";
        int num = (int) (Math.random() * 6) + 1;
        switch (num){
            case 1 : s = "1번";break;
            case 2 : s = "2번";break;
            case 3 : s = "3번";break;
            case 4 : s = "4번";break;
            case 5 : s = "5번";break;
            case 6 : s = "6번";break;

        }
        System.out.println(s);


    }
    @Override
    public void rps(Scanner scanner) {
        System.out.println("num 1");
        int num1 = scanner.nextInt();
        System.out.println("num 2");
        int num2 = scanner.nextInt();
        int count=0;

        for(int i = num1; i <= num2; i++) {
            for(int j=2; j<=i; j++) {
                if(i%j ==0) {
                    count ++;
                }
            }
            if(count==1){
                System.out.println(i+" ");
            }
            count=0;
        }

    }

    @Override
    public void prime(Scanner scanner) {

    }

    @Override
    public void leap(Scanner scanner) {
        int year = scanner.nextInt();
        String res = "";
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            res = year + "년은 윤년";
        } else {
            res = year + "년은 평년";
        }
        System.out.println(res);
        /**
         * 윤년은 해당연도를 4로 나눈값이 0임을 의미한다.
         * 그중 100으로 나눈 값이 0인것은 윤년에서 제외하나
         * 400으로 나눈 값이 0인것은 윤년으로 포함된다.
         * 그 외의 나머지 연도는 평년이다.
         */
    }



    @Override
    public void golf(Scanner scanner) {
        int answer = (int)(Math.random()*100 + 1); //1~100까지 랜덤 자연수
        int input;
        String res = "";

        while (true) {
            System.out.println("1~100 사이 자연수 입력");
            input = scanner.nextInt();
            System.out.println(answer);
            if (answer>input) {
                res ="Up";
            }else if (answer<input){
               res ="Down";
            }else {
                res = "정답";
                break;
        }
            System.out.println(res);
        }

    }}

