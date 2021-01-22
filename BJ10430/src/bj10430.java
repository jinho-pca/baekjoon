import java.util.Scanner;

public class bj10430 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        if(first >= 2 && first <= 10000 && second >= 2 && second <= 10000 && third >= 2 && third <= 10000){
            System.out.println((first+second)%third);
            System.out.println(((first%third) + (second%third))%third);
            System.out.println((first*second)%third);
            System.out.println(((first%third)*(second%third))%third);
        }
    }
}
/**
 * 아직까지는 정확하게 Scanner를 통해 입력을 받았을 때 공백으로 구분이 되는 건지, 엔터로 되는건지 헷갈린다.
 * nextInt(), next(), nextLine() 레퍼런스 참고해봐야겠다.
 * 이 문제는 생각을 해서 푸는게 아니었다.
 * */