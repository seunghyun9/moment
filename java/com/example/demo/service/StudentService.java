package com.example.demo.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentService
 * author     : seunghyun9
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seunghyun9    최초 생성
 */
public interface StudentService {
    String getbmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String login(LoginDTO login);
}
