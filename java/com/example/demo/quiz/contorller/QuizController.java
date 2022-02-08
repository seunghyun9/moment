package com.example.demo.quiz.contorller;

import com.example.demo.quiz.service.Feb06Service;
import com.example.demo.quiz.service.Feb06erviceImpl;
import com.example.demo.quiz.service.Feb07Service;
import com.example.demo.quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.contorller
 * fileName   : QuizController
 * author     : seunghyun9
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seunghyun9    최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner){
        Feb06Service feb06Service = new Feb06erviceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();

        while (true){
            System.out.println("[서브메뉴] 0)Exit 1)2월6일 2)2월7일 3)2월8일 3)2월9일");
            switch (scanner.next()){
                case "0":
                    System.out.println("### Exit ###");
                    return;
                case "1":
                    String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                            "Sort", "Stack", "Hash", "Heap", "Greedy",
                            "Binary Search", "Queue", "Graph", "DFS", "BFS",
                            "Brute Force", "DP",};
                    System.out.println("[소메뉴] 0.Exit\n1.팀별 과제 출력\n" +
                            "2.팀장이 맡은 과제만 출력\n3.큐를 담당한 사람을 출력\n4.팀원별 과제 수를 출력");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("1.팀별과제 출력");
                            feb06Service.quiz1(arr);break;
                        case "2" :
                            System.out.println("2.팀장이 맡은 과제 출력");
                             feb06Service.quiz2(arr);break;
                        case "3" :
                            System.out.println("3.큐를 담당한 사람을 출력");
                            feb06Service.quiz3(arr);break;
                        case "4" :
                            System.out.println("4.팀원별 과제 수를 출력");
                            feb06Service.quiz4(arr);break;
                        default:
                            System.out.println("Wrong");break;
                    }break;

                case "2":
                    System.out.println("[소메뉴]0.Exit\n1.주사위(dice)\n2.가위바위보(RPS)\n"+
                            "3.입력받은 두 수 사이의 있는 소수 구하기(Get Prime)\n" +
                            "4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기(Leap Year)\n" +
                            "5.임의로 입력받은 숫자 맞추기(Number Golf)");

                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;

                        case "1": System.out.println(" 주사위");
                           feb07Service.dice(scanner);
                            break;

                        case "3": System.out.println("두 수를 입력하시오.");
                            feb07Service.rps(scanner);
                            break;

                        case "4": System.out.println("연도를 입력하시오");
                            feb07Service.leap(scanner);
                            break;
                        case "5" :
                            System.out.println("Up & Down 게임");
                            feb07Service.golf(scanner);
                            break;

                        default:
                            System.out.println("Wrong");break;

                    }







            }

        }


    }
}
