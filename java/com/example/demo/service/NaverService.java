package com.example.demo.service;

import com.example.demo.domain.NaverDTO;

/**
 * packageName: com.example.demo.Naver
 * fileName   : NaverDemo
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class NaverService {
    public String getNaver(NaverDTO naver){

        return String.format("ID : %s PW : %s 로그인성공",naver.getID(),naver.getPw());

   }
}
