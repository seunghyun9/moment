package com.example.demo.controller;

import com.example.demo.domain.GoogleDTO;
import com.example.demo.service.GoogleService;
import com.example.demo.domain.NaverDTO;
import com.example.demo.service.NaverService;
import com.example.demo.domain.BmiDTO;
import com.example.demo.service.BmiService;
import com.example.demo.domain.CalcApp;
import com.example.demo.service.CalcDemo;
import com.example.demo.domain.GradeDTO;
import com.example.demo.service.GradeService;
import com.example.demo.domain.LoginDTO;
import com.example.demo.service.LoginService;

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

        BmiService bmiService= new BmiService();
        BmiDTO bmi = new BmiDTO();

        GoogleService googleService = new GoogleService();
        GoogleDTO google = new GoogleDTO();

        GradeDTO grade = new GradeDTO();
        GradeService gradeService = new GradeService();

        LoginService loginDemo = new LoginService();

        NaverService naverService =new NaverService();
        NaverDTO naver = new NaverDTO();

            while(true) {
                System.out.println("메뉴 선택");
                String menu = " 0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN 6.NAVER";
                System.out.println(menu);
                String select = scanner.next();
                String res = "";

                switch (select){
                    case "0" :
                        System.out.println("Exit"); return;
                    case "1" :
                        System.out.println(BmiDTO.BMI_TITLE+"\n 이름 키 몸무게 입력");
                        bmi.setName(scanner.next());
                        bmi.setCm(scanner.nextInt());
                        bmi.setKg(scanner.nextInt());
                        res = bmiService.getBmi(bmi);
                        break;
                    case "2" :
                        System.out.println(CalcApp.CALC_TITLE+"\n숫자1, 연산자, 숫자2 입력");
                        res = calcDemo.excute( scanner.nextInt(),  scanner.next(),  scanner.nextInt());
                        break;
                    case "3" :
                        System.out.println(GoogleDTO.Google_TITle+"\n검색어 입력");
                        google.setSearch(scanner.next());
                        res = googleService.getGoogle(google);
                        break;
                    case "4" :
                        System.out.println(GradeDTO.GRADE_TITLE+"\n 이름, 국어, 영어, 수학 입력");
                        grade.setName(scanner.next());
                        grade.setEng(scanner.nextInt());
                        grade.setKor(scanner.nextInt());
                        grade.setMath(scanner.nextInt());
                        res = gradeService.execute(grade);
                        break;
                    case "5" :
                        System.out.println(LoginDTO.LOGIN_TITLE+"\n ID, PW, Name 입력");

                        break;

                    case "6" :
                        System.out.println("ID, PW 입력");
                        naver.setId(scanner.next());
                        naver.setPw(scanner.next());
                        res = naverService.getNaver(naver);

                        break;


                    default: res = "WRONG"; break;

                /*
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

                 */
                }


                System.out.println(res);

            }
        }
    }


