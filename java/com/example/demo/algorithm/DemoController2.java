package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : seunghyun9
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seunghyun9    최초 생성
 */
public class DemoController2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queque queque = new Queque();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("[Menu] 0.Exit\n" +
                    "[XXX]1. stack \t" +
                    "2. queue \t"+
                    "3. heap \n"+
                    "[XXX]4. hash \t"+
                    "5. sort \n"+
                    "[XXX]6. brute force \t"+
                    "7. dfs \t"+
                    "8. bfs \n"+
                    "[XXX]9. dp \t"+
                    "10. graph \n"+
                    "[XXX]11. bin search \t"+
                    "12. greedy");

            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    System.out.println(stack.solution(null));break;
                case "2" :
                    System.out.println(queque.solution(0,0, null ));break;
                default:
                    System.out.println("Wrong number");break;


            }
        }
    }
}
