package com.example.demo.member.cotroller;

import com.example.demo.member.domain.*;
import com.example.demo.member.service.MemberService;
import com.example.demo.member.service.MemberServiceImpl;

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
public class MemberController {
    public void execute(Scanner scanner) {

                MemberService service = new MemberServiceImpl(); // 실존하며 값이 있는 상태이다.
        MemberService service2 = null; //실존하지만 값은 없는상태

            while(true) {
                System.out.println("메뉴 선택");
                String menu = " 0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN ";
                System.out.println(menu);
                String select = scanner.next();
                String res = "";

                switch (select){
                     case "0" :
                        System.out.println("Exit"); return;
                    case "1" :
                        System.out.println(BmiDTO.BMI_TITLE+"\n 이름 키 몸무게 입력");
                        BmiDTO b = BmiDTO.getInstance();
                        b.setName(scanner.next());
                        b.setTall(scanner.nextDouble());
                        b.setWeight(scanner.nextDouble());
                        res = service.getbmi(b);
                        break;

                    case "2" :
                        System.out.println(CalcDTO.CALC_TITLE+"\n숫자1, 연산자, 숫자2 입력");
                        CalcDTO c = CalcDTO.getInstance();
                        c.setNum1(scanner.nextInt());
                        c.setOpcode(scanner.next());
                        c.setNum2(scanner.nextInt());
                        res = service.calc(c);

                        break;
                    case "3" :
                        System.out.println(GoogleDTO.Google_TITle+"\n검색어 입력");
                        GoogleDTO s = GoogleDTO.getInstance();
                        s.setSearch(scanner.next());
                        res = service.search(s);
                        break;

                    case "4" :
                        System.out.println(GradeDTO.GRADE_TITLE+"\n 이름, 국어, 영어, 수학 입력");
                        GradeDTO g = GradeDTO.getInstance();
                        g.setName(scanner.next());
                        g.setEng(scanner.nextInt());
                        g.setKor(scanner.nextInt());
                        g.setMath(scanner.nextInt());
                        res = service.getGrade(g);
                        break;

                    case "5" :
                        System.out.println(UserDTO.LOGIN_TITLE+"\n ID, PW, Name 입력");
                        UserDTO u = UserDTO.getInstance();
                        u.setName(scanner.next());
                        u.setId(scanner.next());
                        u.setName(scanner.next());
                        res = service.login(u);
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


