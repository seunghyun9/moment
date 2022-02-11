package com.example.demo.oop.domain;

import java.sql.SQLOutput;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : Phone
 * author     : seunghyun9
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seunghyun9    최초 생성
 */
public class Phone  {
   protected String kind;
   protected String company;
   protected String call;

   public Phone(String k, String c){
       this.kind = k;
       this.company = c;

   }

    public String getKind() {return kind;}
    public String getCompany() {
        return company;
    }
    public String getCall() {
        return call;
    }

    public void setCall(String call) {this.call = call;}

    @Override
    public String toString() {
        return "집전화기{" +
                "폰종류='" + kind + '\'' +
                ",제조사='" + company + '\'' +
                ", 통화내역='" + call + '\'' +
                '}';
    }
}

