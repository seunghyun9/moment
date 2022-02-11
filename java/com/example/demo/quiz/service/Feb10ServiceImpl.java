package com.example.demo.quiz.service;
import java.util.Scanner;
/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : seunghyun9
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10     seunghyun9    최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service {
    @Override
    public void bubbleSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬

    }

    @Override
    public void insertionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬

    }

    @Override
    public void selectionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬

    }

    @Override
    public void quickSort() {
// 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void mergeSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬

    }

    @Override
    public void magicSquare() {
        Scanner scanner = new Scanner(System.in);
        int deg=0;

        while(true){
            {System.out.print("마방진의 홀수 차수를 입력하세요. : ");
                deg = scanner.nextInt();
                if(deg%2==1){}
                else if(deg%2==0){
                    System.out.println("홀수만 입력해야 합니다.");return;}
                else {System.out.println("숫자만 입력해야 합니다.");return;}
            }break;
        }




        int array[][] = new int[deg][deg];
        int a = 1;
        int r = 0;
        int c = deg / 2;

        for(a = 1; a<= (deg*deg); a++){
            array[r][c] = a;
            if (a % deg == 0){
                r++;
            }

            else {
                r--;
                c--;
                if (r <0)
                    r = deg - 1;
                else if (c <0)
                    c = deg - 1;}
        }


        for(int i=0; i<deg; i++){
            for(int j=0; j<deg; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }



    @Override
    public void zigzag( ) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] number = new int[a][a]; ///입력받은 숫자의 형태로 배열을 생성
        int count = 1; //배열안에 차례대로 들어갈 숫자
        int j=0;

        for(int i=0; i<=a-1; i++){    //행의 갯수 즉 사용자로부터 3을 입력받으면

            // number[0][],[1][],[2][]까지 수행됨
            if ((i%2)==0){
                //count의 숫자가 입력되는 진행 방향을 결정 i를 2로 나눠서 0일경우

                for(j =0; j<=a-1; j++){
                    // ---> 방향으로 진행 배열[i][a-1] 즉 3을 입력받으면 [0][0]~[0][2]까지
                    number[i][j]=count;
                    //count 값을 증가시키면서 해당 배열방에 저장함

                    count++;
                }
            }else{
                //count의 숫자가 입력되는 진행 방향을 결정 i를 2로 나눠서 0일 아닐경우

                // 만약 i값이 1이라면
                for(j =a-1; j>=0; j--){
                    //[1][a-1] 즉 [1][2]~[1][0] 방까지

                    number[i][j]=count;
                    // count값을 증가시키면서 차례대로 방에 넣는다.
                    count++;
                }
            }
        }

        for (int k=0; k<=a-1; k++){
            //배열의 행에 해당
            for (int l=0; l<=a-1; l++){
                // 배열의 열에 해당
                System.out.print(number[k][l]+"\t");
                // 저장된 값을 차례대로 출력한다

            }
            System.out.println();
        }
    }



    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
