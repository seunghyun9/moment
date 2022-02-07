package com.example.demo.domain;
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


public class CalcDTO {
    public static String CALC_TITLE = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public String getOpcode(){
        return this.opcode;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

}
