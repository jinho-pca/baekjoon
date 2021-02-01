import java.util.Scanner;

public class bj2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;
        int y = N % 5; // 가질 수 있는 값 : 0, 1, 2, 3, 4
        switch(y){
            case 0 :
                result = N / 5;
                break;
            case 1 :
                result = (N-6) / 5 + 2;
                break;
            case 2 :
                if(N == 7){
                    result = -1;
                    break;
                }else{
                    result = (N-12) / 5 + 4;
                    break;
                }
            case 3 :
                result = (N-3) / 5 + 1;
                break;
            case 4 :
                if(N == 4){
                    result = -1;
                    break;
                }else{
                    result = (N-9) / 5 + 3;
                    break;
                }
        }
        System.out.println(result);
    }
}

/**
 * 백준에서 처음 풀어보는 알고리즘 문제였다.
 *
 * */