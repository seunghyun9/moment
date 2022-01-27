package com.example.demo.grade;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeApp
 * author     : seunghyun9
 * date       : 2022-01-26
 * desc       :
 *  사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 * ########## 성적표 ########
 * 이름: 홍길동
 * > 국어: 80점
 * > 영어: 79점
 * > 수학: 80점
 * 총점: 239점
 * 평균(정수): 79점
 * 합격여부: 합격(불합격)
 * #######################
 * 출력되는 프로그램을 작성
 * 단, 합격 / 불합격 기준은
 * 평균 60점 이상이면 합격
 *
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26     seunghyun9    최초 생성
 */
public class GradeApp {
    public static String GRADE_TITLE = "성적표";
    private String name2;
    private int korea;
    private int english;
    private int math2;
    private String position;
    private String vita;
    public String getGrade(String somthingname, int korgrade, int enggrade, int mathgrade){
        this.name2 = somthingname;
        this.korea = korgrade;
        this.english = enggrade;
        this.math2 = mathgrade;
        int total = korea + english + math2;
        int avg = total / 3 ;
        String pass ;
        if (avg >= 60){pass ="합격";}
        else{pass = "불합격";}
        /*
        (avg >= 60) ? "합격" : "불합격"
         */

        String grade = String.format(" * ########## %s ########\n" +
                " * 이름: %s\n" +
                " * > 국어: %d점\n" +
                " * > 영어: %d점\n" +
                " * > 수학: %d점\n" +
                " * 총점: %d점\n" +
                " * 평균(정수): %d점\n" +
                " * 합격여부: %s\n" +
                " * #######################", GRADE_TITLE, name2, korea, english, math2, total, avg, pass);
        return grade;
    }
}
