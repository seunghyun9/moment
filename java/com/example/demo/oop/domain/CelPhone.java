package com.example.demo.oop.domain;

import com.example.demo.oop.repository.CellPhone;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : Celphone
 * author     : seunghyun9
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seunghyun9    최초 생성
 */
public class CelPhone extends Phone{
    protected boolean portable;
    protected String move;



    public CelPhone(String kind, String company, String move){
     super(kind,company); //super 는 부모의 생성자를 가르킴킴
     this.move = move;
   }

    public boolean isPortable() {
        return portable;
    }

    public String getMove() {
        return move;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }


    @Override
    public String toString() {
        return String.format("%s중에 %s인  %s제품을 사용 해서 %s라고 통화한다."
                ,move,super.getKind(),super.getCompany(),super.getCall());

    }
}
