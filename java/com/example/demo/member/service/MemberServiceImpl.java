package com.example.demo.member.service;

import com.example.demo.member.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentServiceimple
 * author     : seunghyun9
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seunghyun9    최초 생성
 */
public class MemberServiceImpl implements MemberService {
    /**
     *
     * BMI = w / t * t
     * 고도비만 35이상, 중도비만 30 - 34.9
     * 경도비만 25 - 29.9 과체중 23-24.9
     * 정상  18.5-22.9 저체중 18.5미만
     */
    @Override
    public String getbmi(BmiDTO param) {
        double bmi =param.getWeight() /(param.getTall()* param.getTall()) * 10000;
        String s ="";
        if(bmi>=35){
            s= "고도 비만";
        }else
        if(bmi>23 && bmi<=34.9){
            s= "중도 비만";
        }else
        if(bmi>25 && bmi<=29.9){
            s = " 경도 비만(1단계 비만)";
        }else
        if(bmi>25 && bmi<=29.9){
            s = " 과체중";
        }else
        if(bmi>25 && bmi<=29.9){
            s =  "정상";
        }else
        if(bmi<18.5){
            s = "저체중";
        }

        return s;
    }

    @Override
    public String calc(CalcDTO calc) {
        int result = 0;
        switch (calc.getOpcode()){
            case "+": result = calc.getNum1() + calc.getNum2();  break;
            case "-": result = calc.getNum1() - calc.getNum2();  break;
            case "*": result = calc.getNum1() * calc.getNum2();  break;
            case "/": result = calc.getNum1() / calc.getNum2();  break;
        }

        String res = String.format("%d %s %d = %d ",
                calc.getNum1(), calc.getOpcode(), calc.getNum2(), result);
        return res;
    }

    @Override
    public String search(GoogleDTO google) {
        return String.format("### %s ###\n" +
                        "%s 검색결과 ",
                GoogleDTO.Google_TITle,
                google.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
            System.out.println(" GradeService 에 들어옴 ");
            System.out.println(grade.toString());
            int total = grade.getKor() + grade.getEng() + grade.getMath();
            int avg = total / 3;
            String res = (avg >=60) ? "합격" : "불합격";
            return String.format(" * ########## %s ########\n" +
                            " * 이름: %s\n" +
                            " * > 국어: %d점\n" +
                            " * > 영어: %d점\n" +
                            " * > 수학: %d점\n" +
                            " * 총점: %d점\n" +
                            " * 평균(정수): %d점\n" +
                            " * 합격여부: %s\n" +
                            " * #######################", GradeDTO.GRADE_TITLE, grade.getName(), grade.getKor(),
                    grade.getEng(), grade.getMath(), total, avg, res);
        }


    @Override
    public String login(UserDTO login) {
        return (login.getPw().equals(UserDTO.PASSWORD)) ?
                String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", login.getName(), login.getPw())
                :
                String.format(" %s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", login.getId(), login.getPw())
                ;
    }
    }