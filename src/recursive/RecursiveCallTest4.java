package recursive;

public class RecursiveCallTest4 {

	
	public static void main(String[] args) {
		System.out.println(fibo(7));
	}
	public static int fibo(int n) {
		if(n<=2) { return 1; }
		return fibo(n-1)+fibo(n-2);
	}
}
