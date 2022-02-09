package com.example.demo.oop.service;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : PhoneServiceImpl
 * author     : seunghyun9
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seunghyun9    최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void UsePhone(Phone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void UseCelPhone(CelPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void UsedIPhone(IPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void UseGalPhone(GalPhone phone) {
        System.out.println(phone.toString());
    }
}

