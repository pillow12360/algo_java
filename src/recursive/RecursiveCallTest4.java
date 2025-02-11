package recursive;

import java.util.Scanner;

public class RecursiveCallTest4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(fibo(num));
    }

    // Topdown 방식
    public static int fibo(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return fibo(n-2) + fibo(n-1);
    }
}
