package com.example.demo.calc;
/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp.java
 * author     : seunghyun9
 * date       : 2022-01-24
 * desc       :숫자 2개와 연산자 1개를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24     seunghyun9    최초 생성
 * 2022-01-26 김승현 if, swtich 절 추가, 4친연산 기능 가능하도록함
 */


public class CalcApp {
    public static String CALC_TITLE = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String calc(int num1, String opcode,  int num2 ){
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int res = 0;
        /*
        if (opcode.equals("+")){res = this.num1 + this.num2;}else
            if (opcode.equals("-")){ res = this.num1 - this.num2;}else
                if(opcode.equals("*")){ res = this.num1 * this.num2;}else
                    if(opcode.equals("/")){ res = this.num1 / this.num2;}

         */

        switch (opcode){
            case "+" : res = this.num1 + this.num2; break;
            case "-" : res = this.num1 - this.num2; break;
            case "*" : res = this.num1 * this.num2; break;
            case "/" : res = this.num1 / this.num2; break;


        }


        return String.format("%d %s %d = %d",this.num1, this.opcode, this.num2, res);

    }

}
