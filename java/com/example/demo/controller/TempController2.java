package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TemperClass2
 * author     : seunghyun9
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03     seunghyun9    최초 생성
 */
public class TempController2 {
    public static void main(String[] args) {
        String[] onename =      {"김승현",  "최민서",  "한성수",    "김윤섭"};
        String[] onesubjects = {"정렬",     "해시",    "힙",       "스택",
                              "이분탐색",    "그래프",  "깊이/너비",   "큐",
                               "완전탐색",    "탐욕법",  "우선탐색",  "동적계획법"};

        for (int i = 0; i < onename.length; i++) {
            System.out.println(onename[i] + ":" + onesubjects[i] +", "+ onesubjects[i+4]+", "+onesubjects[i+8]);
            


        }

        }


    }

/*
김승현: 정렬 이분탐색 완전탐색
최민서: 해시 그래프 탐욕법
한성수: 힙 깊이/너비 우선탐색
김윤섭: 스택 큐 동적계획법
!배열에서 인덱스 활용법 인지!
*/












