package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.service
 * fileName   : QuizService
 * author     : seunghyun9
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seunghyun9    최초 생성
 */
public class Feb06ServiceImpl implements Feb06Service {
    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요 ");

        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
            //+=는 오버로딩 된것
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] arr) {
        String zzang2 = "";
        System.out.println("Q2.팀장 과제만 출력 ex)name : subject, subject2");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("김윤섭")) {
                for (int j = 0; j < 4; j++) {
                    zzang2 += arr[i + j * 5] + ",";
                }
                if (i == 18) break;
            }
        }
        System.out.println(zzang2);

    }

    @Override
    public void quiz3(String[] arr) {
        System.out.println("Q3-1. 큐를 담당한 사람을 출력하세요. ");
        String qManager = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Queue")) {
                qManager = arr[i] + "를 담당한 사람:" + arr[i % 5];
            }
        }

        System.out.println(qManager);

        System.out.println("Q3-2. 입력한 과목의 인덱스를 추출하시오. ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Queue")) {
                //System.out.println("큐의 인덱스 : "+i);
                System.out.println(arr[i] + " 의 담당자는 " + arr[i - 10]);
            }
            if (arr[i].equals("DP")) {
                //System.out.println("큐의 인덱스 : "+i);
                System.out.println(arr[i] + " 의 담당자는 " + arr[i - 15]);
            }
        }
        //6,11,16,-> 1
        //5,10,15 ->0
        //7,12,17->2

    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원의 과제수를 출력하세요. ex)김윤섭(3개),김승현(3개).....");

        int[] intArr = new int[5];

        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                if (i != 0) {
                    intArr[0]++;
                }
            }

            if (i % 5 == 1) {
                if (i != 1) {
                    intArr[1]++;
                }
            }

            if (i % 5 == 2) {
                if (i != 2) {
                    intArr[2]++;
                }
            }

            if (i % 5 == 3) {
                if (i != 3) {
                    intArr[3]++;
                }
            }

            if (i % 5 == 4) {
                if (i != 4) {
                    intArr[4]++;
                }
            }
        }
        System.out.println(arr[0] + " (" + intArr[0] + "개)");
        System.out.println(arr[1] + " (" + intArr[1] + "개)");
        System.out.println(arr[2] + " (" + intArr[2] + "개)");
        System.out.println(arr[3] + " (" + intArr[3] + "개)");
        System.out.println(arr[4] + " (" + intArr[4] + "개)");

        /*
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        for(int i = 5; i< arr.length; i++){
            int a = i % 5;
            for(int j = 0; j<5; j++){
                if(a == j){
                    intArr[j]++;
                }
                resArr = intArr;
            }
        }
        for(int i = 0; i< 5; i++){
            System.out.println(arr[i]+"("+resArr[i]+"), ");

         */
    }
}
