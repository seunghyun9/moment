package com.example.demo.algorithm;

import com.example.demo.member.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController
 * author     : seunghyun9
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03     seunghyun9    최초 생성
 */
public class TempController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수는 몇명?");
        int count = scanner.nextInt();
        GradeDTO[] grades = new GradeDTO[count]; // 컨테이너 (부모객체)

        //GradeDTO[] grades = new GradeDTO[2];
        // 인스턴스가 2개 있는것 grades 가 인스턴스이며 컨테이너 인스턴트
        //grades[0] = new GradeDTO();
        // First index 는 0부터 시작, 한명이라는 뜻, 이 시점부터 인스턴트가 된다
        //엘리먼트 값을 불러오려면 음

          for(int i = 0; i < grades.length; i++) {
          System.out.println("수학점수 입력");
          grades[i] = new GradeDTO(); // 인스턴트 요소객체 (자식객체)
          grades[i].setMath(scanner.nextInt());
      }
      for(int i = 0; i < grades.length; i++){
          System.out.println("수학점수 : " + grades[i].getMath());
      }


    }



}
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeDTO[] grades = new GradeDTO[3];
        GradeDTO[][] grades2 = new GradeDTO[3][1];
        GradeDTO[][][] grades3 = new GradeDTO[3][1][4];
        for (int i=0; i< grades.length; i++) {
            grades[i] = new GradeDTO();
            System.out.println("이름 국어 영어 수학 점수입력");
            grades[i].setName(scanner.next());
            grades[i].setKor(scanner.nextInt());
            grades[i].setEng(scanner.nextInt());
            grades[i].setMath(scanner.nextInt());
        }

        for(int i =0; i< grades.length;i++) {
            System.out.println(grades[i].getName());
            System.out.println(grades[i].getKor());
            System.out.println(grades[i].getEng());
            System.out.println(grades[i].getMath());
        }




    }

 */
