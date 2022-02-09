package com.example.demo.oop.repository;

/**
 * packageName: com.example.demo.oop.repository
 * fileName   : Test
 * author     : seunghyun9
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seunghyun9    최초 생성
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("테스트");
        DmbCellPhone dmbCellPhone =  new DmbCellPhone("자바폰","검정",10);

        System.out.println("모델" + dmbCellPhone.model);
        System.out.println("색상" + dmbCellPhone.color);


        System.out.println("채널" + dmbCellPhone.channel);

        dmbCellPhone.poweron();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요. 저는 아무개입니다.");
        dmbCellPhone.sendVoice("아~ 반갑습니다.");
        dmbCellPhone.hangup();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();



    }
}
