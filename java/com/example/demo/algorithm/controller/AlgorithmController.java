package com.example.demo.algorithm.controller;

import com.example.demo.algorithm.service.BfsService;
import com.example.demo.algorithm.service.BinSearchService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm.controller
 * fileName   : AlgorithmController
 * author     : seunghyun9
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seunghyun9    최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner){


        while (true){
            System.out.println("[담당] 0.종료 1.김승현 2.김윤섭 3.최민서 4.한성수");

            switch (scanner.next()){
                case "0" : System.out.println("### 종료 ###");return;
                case "1" :


                default:
                    System.out.println("잘못된 번호");break;

            }
        }
    }
}
