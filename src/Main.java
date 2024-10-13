import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] num = new int[3][2];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        if(num[0][0] == num[1][0]) {
            System.out.print(num[2][0] + " ");
        }
        if(num[2][0] == num[1][0]) {
            System.out.print(num[0][0] + " ");
        }
        if(num[2][0] == num[0][0]) {
            System.out.print(num[1][0] + " ");
        }
        if(num[0][1] == num[1][1]) {
            System.out.print(num[2][1]);
        }
        if(num[2][1] == num[1][1]) {
            System.out.print(num[0][1]);
        }
        if(num[2][1] == num[0][1]) {
            System.out.print(num[1][1]);
        }
    }
}