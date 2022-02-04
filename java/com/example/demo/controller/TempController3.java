package com.example.demo.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController3
 * author     : seunghyun9
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-04     seunghyun9    최초 생성
 */
public class TempController3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1.팀별 과제만 출력");
        String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                "Sort", "Stack", "Hash", "Heap", "Greedy",
                "Binary Search", "Queue", "Graph", "DFS", "BFS",
                "Brute Force", "DP",  };
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {s += "\n";}
            s += i + ":" + arr[i] + "\t";
            //+=는 오버로딩 된것
        }
        System.out.println(s);

        System.out.println("Q2.팀장 과제만 출력 ex)name : subject, subject2");
        String zzang = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("김윤섭")){
               zzang += arr[i] + " : " + arr[i+5]+", "+ arr[i+10]+", "+arr[i+15];
               break;
                }}
            System.out.println(zzang);

        System.out.println("Q2.팀장 과제만 출력 ex)name : subject, subject2");

        String zzang2 = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("김윤섭")){
                for(int j=0; j<4; j++) {
                    zzang2 += arr[i+j*5]+",";
                }
                if(i==18)break;
                }
        }
        System.out.println(zzang2);




        System.out.println("Q3-1. 큐를 담당한 사람을 출력하세요. ");
        String qManager = "";
        qManager = arr[11] +"를 담당한 사람:" + arr[2];
        System.out.println(qManager);


        System.out.println("Q3-2. 입력한 과목의 인덱스를 추출하시오. ");

        for (int i=0;i<arr.length;i++){
            if(arr[i].equals("Queue")) {
                //System.out.println("큐의 인덱스 : "+i);
                System.out.println(arr[i] + " 의 담당자는 " + arr[i - 5]);
            }

                if(arr[i].equals("DP")){
                    //System.out.println("큐의 인덱스 : "+i);
                    System.out.println(arr[i] + " 의 담당자는 "+arr[i-15]);}
        }
        //6,11,16,-> 1
        //5,10,15 ->0
        //7,12,17->2



        System.out.println("Q4. 팀원의 과제수를 출력하세요. ex)김윤섭(3개),김승현(3개).....");
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        String countManager =arr[0]+"(3개)," + arr[1]+"(3개),"+ arr[2]+"(3개),"+ arr[3]+"(3개)";
        System.out.println(countManager);

        for(int i=0; i<17; i++){
            if(arr[i].equals(arr[5])){
                count0++;
            }
            if(arr[i].equals(arr[6])){
                count1++;
            }
            if(arr[i].equals(arr[7])){
                count2++;
            }
            if(arr[i].equals(arr[8])){
                count3++;
            }
            if(arr[i].equals(arr[9])){
                count4++;
            }

        }
        System.out.println(arr[0]+"의 카운트는"+count0);
        System.out.println(arr[1]+"의 카운트는"+count1);
        System.out.println(arr[2]+"의 카운트는"+count2);
        System.out.println(arr[3]+"의 카운트는"+count3);
        System.out.println(arr[4]+"의 카운트는"+count4);





//출력된 값이 하나라면 오버라이징 된것이다.
    }
}


