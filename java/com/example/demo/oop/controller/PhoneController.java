package com.example.demo.oop.controller;

import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : RfpController
 * author     : seunghyun9
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seunghyun9    최초 생성
 */
public class PhoneController {
    public void execute(Scanner scanner) {
        PhoneService service = new PhoneServiceImpl();
        String res = "";
        while (true){
            System.out.println(" 메뉴를 선택하시오 0.종료 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트");

            switch (scanner.next()){

            case "0": System.out.println("Exit");break;

            case "1": System.out.println("집전화");
            service.UsePhone(scanner);return;

            case "2": System.out.println("휴대폰");
                service.UseCelPhone(scanner);return;

            case "3": System.out.println("아이폰");
                service.UsedIPhone(scanner);return;

            case "4": System.out.println("갤럭시노트");
                service.UseGalPhone(scanner);break;

            default: res = "WRONG"; break;}



        }

    }
}
