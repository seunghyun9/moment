package com.example.demo.controller;

import com.example.App.bmi.BmiApp;
import com.example.demo.Google.GoogleApp;
import com.example.demo.Google.GoogleDemo;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;

import javax.swing.*;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : seunghyun9
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seunghyun9    최초 생성
 *
 * Switch 안에서 return 과 break 의 차이점?
 * break는 반복문 (for / while / do-while/until) 을 벗어나서 다음 코드를 실행합니다.
 *
 * return은 함수 또는 메서드를 벗어납니다.
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcDemo calcDemo = new CalcDemo();
        BmiDemo bmiDemo = new BmiDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();

            while(true) {
                System.out.println("메뉴 선택");
                String menu = " 0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
                System.out.println(menu);
                String select = scanner.next();
                String res = "";

                switch (select) {
                    case "0":
                        System.out.println("EXIT");
                        return;
                    case "1":
                        res = "1.BMI ";
                        System.out.println(BmiApp.BMI_TITLE +"\n이름 키 몸무게 입력");
                        System.out.println(bmiDemo.excute(scanner.next(),scanner.nextInt(),scanner.nextInt()));
                        break;
                    case "2":
                        res = "2.CALC";
                        System.out.println(CalcApp.CALC_TITLE+"\n숫자1, 연산자, 숫자2 입력");
                        System.out.println(calcDemo.excute(scanner.nextInt(),scanner.next(),scanner.nextInt()));
                        break;
                    case "3":
                        res = "3.SEARCH";
                        System.out.println(GoogleApp.Google_TITle +"\n검색어 입력");
                        System.out.println(googleDemo.excute(scanner.next()));
                        break;
                    case "4":
                        res = "4.GRADE";
                        System.out.println(GradeApp.GRADE_TITLE +"\n이름 국어 영어 수학 점수입력 ");
                        break;
                    case "5":
                        res = "5.LOGIN";
                        System.out.println(LoginApp.LOGIN_TITLE+ "\n 이름 아이디 비밀번호 입력");
                        System.out.println(loginDemo.excute(scanner.next(),scanner.next(),scanner.next()));
                        break;
                    default:
                        res = "WRONG";
                        break;
                }


                System.out.println(res);

            }
        }
    }


