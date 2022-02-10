package com.example.demo.quiz.service;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : practice
 * author     : seunghyun9
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10     seunghyun9    최초 생성
 * //홀수 정사각형의 크기를 입력 받은 후, 가로 세로 대각선의 합이 일정한 마방진을 출력하는 프로그램을 작성하시오.
 * //<처리조건>
 * //(1) 첫 번째 숫자인 1을 넣는 위치는 첫 번째 행 가운데이다.
 * //(2) 숫자가 N의 배수이면 바로 아래의 행으로 이동하여 다음의 수를 넣고
 * //(3) 그렇지 않으면 왼쪽 위로 이동하여 다음의 숫자를 넣는다. 만약 행이 첫 번째를 벗어나면 마지막 행으로 이동하고, 열이 첫 번째를 벗어나면 마지막 열로 이동한다.
 * //입력 형식: 정사각형의 크기 n(2부터 100사이의 홀수)을 입력받는다.
 * //출력 형식: 위에서 언급한 형태로 정사각형의 내부 숫자를 차례로 채운 후의 모습을 출력한다. 숫자 사이는 공백으로 구분한다.
 * [출처] [자바] 39. 마방진|작성자 kjy48048
 */
public class practice {public static void main(String[] main){
    Scanner scanner = new Scanner(System.in);

    int deg=0;

    while(true){
        {System.out.print("마방진의 홀수 차수를 입력하세요. : ");
            deg = scanner.nextInt();
            if(deg%2==1){}
        else if(deg%2==0){
            System.out.println("홀수만 입력해야 합니다.");return;}
                else {System.out.println("숫자만 입력해야 합니다.");return;}
        }break;
    }




    int array[][] = new int[deg][deg];
    int a = 1;
    int r = 0;
    int c = deg / 2;

    for(a = 1; a<= (deg*deg); a++){
        array[r][c] = a;
        if (a % deg == 0){
            r++;
        }

        else {
            r--;
            c--;
            if (r <0)
                r = deg - 1;
            else if (c <0)
                c = deg - 1;}
    }


    for(int i=0; i<deg; i++){
        for(int j=0; j<deg; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
    }
}}
