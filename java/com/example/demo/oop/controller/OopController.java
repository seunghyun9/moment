package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.oop.controller
 * fileName   : OopController
 * author     : seunghyun9
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seunghyun9    최초 생성
 */
public class OopController {
    public void execute(Scanner scanner){
        while (true){
            System.out.println("[메뉴] 0.Exit \n1.은닉화\n2.상속\n3.추상화\n4.다형성 ");
            switch (scanner.next()){
                case "0": System.out.println("Exit");return;
                case "1":
                    System.out.println("POJO 가 은닉화다");break;
                case "2":
                    System.out.println("extends 가 상속이다.");
                    Phone phone =  new Phone("금전전화기","금성전자");
                    CelPhone celPhone = new CelPhone("핸드폰","블랙베리","이동중에");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");

                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴]0.Exit \n1.집전화\n2.휴대폰\n3.아이폰\n4.갤럭시");
                    switch (scanner.next()){
                        case"0":System.out.println("Exit");return;
                        case"1":
                            System.out.println("###집전화###");
                            phone.setCall("여보세요. 아무개입니다.");
                            phoneService.UsePhone(phone);
                            break;
                        case"2":
                            System.out.println("###휴대폰###");
                            celPhone.setCall("안녕하세요");
                            phoneService.UseCelPhone(celPhone);
                            break;
                        case "3":
                            System.out.println("###아이폰###");
                            iPhone.setSearch("뉴스");
                            phoneService.UsedIPhone(iPhone);
                            break;
                        case "4" :
                            System.out.println("###갤럭시###");
                            galPhone.setPay("삼성 페이");
                            phoneService.UseGalPhone(galPhone);
                            break;
                        default:
                            System.out.println("WRONG");break;}
                            break;}



                   }





    }
}

