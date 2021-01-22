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
