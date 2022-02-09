package com.example.demo.oop.repository;
import java.util.Scanner;
/**
 * packageName: com.example.demo.oop.domain
 * fileName   : CellPhone
 * author     : seunghyun9
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seunghyun9    최초 생성
 */
public class CellPhone {
    String model;
    String color;

    void poweron(){System.out.println("전원을 킵니다.");}
    void poweroff(){System.out.println("전원을 끕니다.");}
    void bell(){System.out.println("벨이울립니다.");}
    void sendVoice(String message){System.out.println("자기:" + message);}
    void receiveVoice(String message){System.out.println("상대방:" + message);}
    void hangup(){System.out.println("전화를 끊습니다.");}

}
