import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1244 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[] switchArray = new int[T];
        int[] man = new int[2];
        int[] woman = new int[2];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0; i < T; i++) {
            switchArray[i] = Integer.parseInt(st.nextToken());
        }

        int students = Integer.parseInt(bf.readLine());
        for(int i = 0; i < students; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(sex == 1) { //  남자
                for(int j = num; j <= T; j += num) {
                    switchArray[j-1] = switchArray[j-1] == 0 ? 1 : 0;
                }
            } else { //  여자
                for(int j = num-1; j > 0 && 2*num - j-1 <T; j--) {
                    if(switchArray[j-1] == switchArray[2*num - j-1]) {
                        switchArray[j-1] = switchArray[j-1] = switchArray[j-1] == 0 ? 1 : 0;
                        switchArray[2*num - j-1] = switchArray[2*num - j-1] = switchArray[2*num - j-1] == 0 ? 1 : 0;
                        continue;
                    }else {
                        break;
                    }
                }
                switchArray[num-1] = switchArray[num-1] == 0 ? 1 : 0;
            }
        }
        for(int i = 1; i <= T; i++) {
            System.out.print(switchArray[i-1] + " ");
            if(i % 20 == 0) {
                System.out.println();
            }
        }
    }
}

/**
 * 후기
 * 첫 알고리즘 수업과제로 풀어봤는데 구현하는 것은 어렵지 않았지만
 * 아직도 자바 문법에 취약한것같다
 * BufferedReader, StringBuilder... 갈길이 멀었다.ㅠ
 * */