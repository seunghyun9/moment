package com.example.demo.controller;

import com.example.demo.service.Feb07Service;
import com.example.demo.service.Feb07ServiceImpl;
import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : seunghyun9
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seunghyun9    최초 생성
 *
 * 1.주사위 (DICE)
 * 2. 가위바위보 (RPS)
 * 3. 입력받은 두 수 사이의 있는 소수 구하기 (getPrime)
 * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기(leap Year)
 * 5. 임의로 입력받은 숫자 맞추기 (numberGolf)
 */
public class Feb07Controller {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Feb07Service service =  new Feb07ServiceImpl();

        while(true) {
            System.out.println("메뉴 선택");
            String menu = "1. 주사위(dice) \n" +
                    "2. 가위바위보(RPS) \n" +
                    "3. 입력받은 두 수 사이의 있는 소수 구하기(Get Prime)\n" +
                    "4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기(Leap Year)\n" +
                    "5. 임의로 입력받은 숫자 맞추기(Number Golf)";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select) {

                case "1": System.out.println(" 주사위");
                    service.dice(scanner);
                    return;

                case "3": System.out.println("두 수를 입력하시오.");
                    service.rps(scanner);
                    return;

                case "4": System.out.println("연도를 입력하시오");
                service.leap(scanner);
                    return;
                case "5" :
                    System.out.println("Up & Down 게임");
                    service.golf(scanner);
                    break;


                default: res = "WRONG"; break;


            }
        }
    }}
