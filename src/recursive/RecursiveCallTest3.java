package recursive;

import java.util.Scanner;

public class RecursiveCallTest3 {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fac2(num));
    }

//    Topdown 방식
    public static int fac2 (int n) {
        if( n == 1) return 1;
        return n * fac2(n-1);
    }
}
