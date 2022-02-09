package com.example.demo.oop.domain;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : Galphone
 * author     : seunghyun9
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seunghyun9    최초 생성
 * 갤럭시라 하고, 신형폰은 페이 기능을 지원
 */
public class GalPhone extends IPhone {
   public final static String KIND = "갤럭시";
   private String pay;

    public GalPhone(String company){
        super(company);
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s제품을 사용해서 %s로 결제한다",
                super.getCompany(),KIND,pay);
    }
}
