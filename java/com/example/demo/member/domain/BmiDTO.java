package com.example.demo.member.domain;


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
    private final static BmiDTO bmiDTO = new BmiDTO();
    public BmiDTO(){}
    public static BmiDTO getInstance(){return bmiDTO;}

    static public String BMI_TITLE = "BMI";
    private String name;
    private double tall;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
