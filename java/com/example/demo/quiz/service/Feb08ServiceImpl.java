package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb08erviceImpl
 * author     : seunghyun9
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seunghyun9    최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service {

    @Override
    public void lotto(Scanner scanner) {
        int lotto[] = new int[6];
        System.out.println("로또 번호 : ");
        for(int i = 0; i< lotto.length; i++) {
            int num = (int) (Math.random() * 45) + 1;
            lotto[i] = num;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
        for(int i = 0; i< lotto.length; i++) {
            System.out.println( lotto[i]);
        }
    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {
        String [][] seat = new String[7][7];
        String [] list = {"A","B","C","D","E","F","G"};
        for(int i =0; i<7;i++){
            for (int j=0; j<7;j++){
                seat[i][j] = " □ ";}}
        /* 풀이자: 김승현
        스크린 자리를 표현하기 위하여 행값 7 열값 7을 갖는 2중 배열 seat를 선언했다.이후에 행표시를 위하여 1차원 배열 list를 선언하고 값을 주었다.
         행이름과 빈좌석 표현을 위하여 for 문을 사용하였다. i값은 0 부터 7보다 작은 수를 가지며 점점커지며 그 안에서 J값은 0부터 7보다 작은 수를 가지며
         실행된다. i와 j는 각각 seat [i] [j]에 입력되며 "ㅁ" 으로 표시된다.

        참고: https://zodlab.tistory.com/16
         */
        while (true){
            System.out.println("\n원하시는 메뉴번호를 입력 해주세요.\n0.Exit 1.예약조회 2.예약신청 3.예약취소");
            int select = scanner.nextInt();
            switch (select){
            case 0:
                System.out.println("종료");return;
            case 1 : {for (int i = 0; i < 7; i++) {
                System.out.print("\n" + list[i] + " ");
                for (int j = 0; j < 7; j++) {
                    System.out.print(seat[i][j]);}}}break;
                /* 메뉴번호를 출력후에 번호를 받고 스위치문을 사용하여 받은 번호에 따라 실행되는 구문을 만들었다.
                0번을 입력하면 종료 출력과 함께 다시 돌아가게 된다.
                1번을 입력시 for 문이 자동한다. i 값은 0~ 6 까지 점점 커진다 .i값은 list[i]에 들어가며 A부터 G까지 출력된다
                줄을 바꿔 출력 시키기 위하여 \n을 사용하였다. J값도 0 ~6으로 점차 커진다.
             */

            case 2:
                    System.out.println("행번호를을 입력해주세요. A(1) ~ G(7) ");
                    int row = scanner.nextInt() - 1;
                    while (row > 6){
                        System.out.println("존재하지 않는 행입니다.");return;
                    }
                    System.out.println("열번호를 입력해주세요. 1 ~ 7");
                    int col = scanner.nextInt() - 1;
                    while (col > 6){
                        System.out.println("존재하지 않는 열입니다.");return;
                    }
                    seat[row][col] = " ■ ";
                    System.out.println("예약 신청되었습니다.");
                    break;
                    /*
                    입력받은 값을 -1 하는 이유는 행과 열은0부터 카운트가 되기 때문이다.
                    while을 사용하여 7보다 큰값을 입력 한 경우 저장된 메시지를 출력한다.
                    입력받은 행값과 열값은 " ■ "로 출력된다.
                     */

            case 3:
                    System.out.println("행번호를을 입력해주세요. A(1) ~ G(7)");
                    int row2 = scanner.nextInt() - 1;
                    while (row2 > 6){
                        System.out.println("존재하지 않는 행입니다.");return;
                    }
                    System.out.println("열번호를 입력해주세요. 1 ~ 7");
                    int col2 = scanner.nextInt() - 1;
                    while (col2 > 6){
                        System.out.println("존재하지 않는 열입니다.");return;
                    }
                    seat[row2][col2] = " □ ";
                    System.out.println("예약이 취소되었습니다.");
                    break;
                default:System.out.println("존재하지 않는 메뉴번호 입니다.");break;
                /*
                케이스 2번과 같은 원리로 작동된다.
                 */
            }
        }
    }
    @Override
    public void bank(Scanner scanner) {
        int money = 0;
        System.out.println("이름 입력");
        String name = scanner.next();
        System.out.println("계좌 비밀번호 입력");
        int pw = scanner.nextInt();
        System.out.println("계좌 인증 완료");
        while (true) {
            System.out.println("0.종료 1.입금 2.출금 3.잔고");
            int input = scanner.nextInt();
            switch (input) {
                case 0 :
                    System.out.println("종료"); return;
                case 1 :
                    System.out.println("입금 : ");
                    money += scanner.nextInt();
                    break;
                case 2 :
                    System.out.println("출금 :");
                    money -= scanner.nextInt();
                    break;
                case 3 :
                    System.out.println(name + "님의 잔고 : " + money + "원");
                    break;
                default:
                    System.out.println("0~3 입력"); break;
            }
        }
    }

    @Override
    public void gugudan(Scanner scanner) {
        int a = (int) (Math.random() * 9 + 1);
        int b = (int) (Math.random() * 9 + 1);
        int res = a * b;

        System.out.println(a + "*" + b + "= ?");
        int input = scanner.nextInt();
        System.out.println((input == res) ? "정답입니다." : "오답입니다.");
        System.out.println("출력할 단을 입력하세요 : ");
        int i = scanner.nextInt();
        for (int j = 1; j < 10; j++) {
            System.out.println(i + "*" + j + "=" + i * j);
        }
    }

    }
