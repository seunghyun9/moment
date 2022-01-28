package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.Google
 * fileName   : GoogleDemo
 * author     : seunghyun9
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seunghyun9    최초 생성
 */
public class GoogleService {
    public String getGoogle(GoogleDTO google){

        return  String.format("입력하신 검색어는 %s입니다.", google.getSearch());


    }


    }

