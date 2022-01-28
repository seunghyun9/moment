package com.example.demo.domain;


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
public class BmiDTO {
    static public String BMI_TITLE = "BMI";
    private String name;
    private int cm;
    private int kg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;

    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;


    }

}
/*
    public String getbmi(String name, int cm, int kg){
        this.name = name;
        this.cm = cm;
        this.kg = kg;

        return String.format("%s 씨는 키 %d cm 몸무게 %s로 정상입니다.", this.name, this.cm, this.kg);

    }

*/
