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
    /**
     * author : 최민서
     * des : quick sort
     * pivot 이라는 기준 값을 세운 후, pivot보다 작은 element는 왼쪽, 큰 것은 오른쪽으로 정렬 반복
     * 반복이 끝나면 나누어 진 각 부분 안에서 다시 정렬 반복(엘리먼트가 하나씩 남을 때 까지)
     * pivot은 자유롭게 잡을 수 있지만 해당 해설에서는 중간 인덱스 값으로 설정
     * 참고: https://javaoop.tistory.com/8
     * https://www.youtube.com/watch?v=KiIpDEFIjDk
     */
    @Override
    public void quickSort(int[] arr, int start, int end) {
        if(start<=end){
            int pivot = partition(arr, start, end); // partition 메소드에서 리턴 받은 값을 pivot으로 사용

            quickSort(arr, start, pivot-1); // 나누어진 왼쪽 배열 정렬
            quickSort(arr,pivot+1,end); // 나누어진 오른쪽 배열 정렬

        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2]; // pivot 값 중앙 인덱스로 설정
        int temp; // 엘리먼트들을 바꾸어줄 때 임시 저장할 variable
        while (start < end) {
            while (arr[start] < pivot) {
                start++; // pivot보다 작을 경우 무시하고 다음 인덱스로 넘어감
            }
            while (arr[end] >= pivot) {
                end--; // pivot 보다 클 경우 무시하고 앞 인덱스로 넘어감
            }
            if (start <= end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp; // start 값과 end 값 교환하여 pivot 보다 작은 수는 왼쪽
                // 큰 수는 오른쪽으로 정렬
            }
        }
        return start;
    }
    private static int[] sorted;
    @Override
    public void mergeSort(int[] a) {

        sorted = new int[a.length];
        mergeSort(a, 0, a.length - 1);
        sorted = null;
    }

    private void mergeSort(int[] a, int left, int right) {
        if(left == right) return; // element가 하나일 경우 return

        int mid = (left + right) / 2; // 배열을 나눌 중간 부분

        mergeSort(a, left, mid); // 나눈 후 왼쪽 부분 다시 merge 정렬
        mergeSort(a, mid + 1, right); // 나눈 후 오른쪽 부분 merge 정렬

        merge(a, left, mid, right); // 병합
    }
    private static void merge(int[] a, int left, int mid, int right) {
        int l = left; // 왼쪽 부분 시작점
        int r = mid + 1; // 오른쪽 부분 시작점
        int idx = left;


        while(l <= mid && r <= right) {//  각부분의 시작점이 끝점보다 작거나 같을때까지 반복

            if(a[l] <= a[r]) {
                sorted[idx] = a[l];
                idx++;
                l++; //왼쪽 원소와 오른쪽 원소 비교 후 왼쪽이 더 작을 경우,
                // 왼쪽 원소를 새 배열에 넣고 idx++
            }
            else {
                sorted[idx] = a[r];
                idx++;
                r++; //왼쪽 원소와 오른쪽 원소 비교 후 오른쪽이 더 작을 경우,
                // 오른쪽 원소를 새 배열에 넣고 idx++
            }
        }

        if(l > mid) { // l > mid 일 경우, 왼쪽 배열의 element가 새 배열에 다 채워짐
            while(r <= right) {
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }
        else {
            while(l <= mid) {
                sorted[idx] = a[l];
                idx++;
                l++; // 오른쪽 부분도 위와 같이 새 배열에 채우기
            }
        }

        for(int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }  // 새로 채운 배열을 원래 배열에 넣기
    } /** 출력 부분 어떻게 연결해야할지 막힘
     */

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
        /*
        풀이자: 김승현
        참조: https://dyndy.tistory.com/72
        위의내용 랜덤값 받는걸로 수정 예정

         */


        int array[][] = new int[deg][deg];
        int a = 1;
        int r = 0;
        int c = deg / 2;
        /*
        행 deg 열 deg 값을 갖는 이중배열 arry를 만든다.
        a r c 의 값을 각각 준다.6
         */

        for(a = 1; a<= (deg*deg); a++){
            array[r][c] = a;
            if (a % deg == 0){
                r++;
            }
            /* for문 안의 a값은 1  부터 시작되며 a의값은 배열안에 들어가는 값이 되기에 최대 deg*deg까지이다.
             a를 deg로 나눈 나머지 값이 0이면 r값은 증가한다. 0이 아닌 다른값이 나오면  else문으로 이동한다.
             */
            else {
                r--;
                c--;
                if (r <0)
                    r = deg - 1;
                else if (c <0)
                    c = deg - 1;}
        }
        /*
        else문에서 r값과 c값은 감소하며 여기서 만약 r값이 0보다 작다면 r은 deg-1값이 된다. / r값이 0 보다 작지 않고
        c가 0보다 작을 때  c값은 deg-1 값이된다.
        */
        System.out.println(array[deg][deg]);
/*
        for(int i=0; i<deg; i++){
            for(int j=0; j<deg; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();       }

 */

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
