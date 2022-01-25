package com.example.App.bmi;


/**
 * packageName: com.example.App.bmi
 * fileName   : BmiApp
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class BmiApp {
    static public String BMI = "BMI";
    String name;
    int cm;
    int kg;

    public String bmi(String name, int cm, int kg){
        this.name = name;
        this.cm = cm;
        this.kg = kg;

        return String.format("%s 씨는 키 %d cm 몸무게 %s로 정상입니다.", this.name, this.cm, this.kg);

    }





    }