package com.example.demo.oop.repository;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : DmbCellPhone
 * author     : seunghyun9
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seunghyun9    최초 생성
 */
public class DmbCellPhone extends CellPhone {
    int channel;
    DmbCellPhone(String model,String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("채널" + channel+ "번 DMB방송을 수신합니다.");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널"+channel+"번으로 바꿉니다.");
    }
    void turnOffDmb(){
        System.out.println("DMB방송을 중지합니다.");
    }
}
