package fillCell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * NxN 배열을 위한 기지국(A)와 집(H)에 대한 정보가 주어진다.
 * 기지국(A)은 상하좌우 1셀씩만 커버한다. 커버하지 못하는 집(H)의 개수를 출력
 *
 * [제약조건]
 * N은 3~15 이하
 *
 * [입력]
 * 첫 줄은 테스트 케이스 수(T)가 주어진다.
 * 두 번째 줄은 배열 크기(N)이 주어지고
 * 세 번째 줄부터 N개의 기지국 정보가 제공된다.
 *
 * [출력 결과]
 * #1 4
 * #2 5
 * #3 9
 *
 */
public class BaseStation1 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/BaseStation1.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스 개수 입력
		sc.nextLine();

		int[]dr = {-1,1,0,0};
		int[]dc = {0,0,-1,1};

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 배열 크기 입력
			sc.nextLine();
			int answer = 0;
			String[][] arr = new String[N][N];

			// 2차원 배열 입력 받기
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextLine().trim().split("\\s+"); // 공백 기준으로 나누기
			}

			// 기지국일 때, 상하좌우에 위치한 H를 X로 변경
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++)

					if(arr[i][j].equals("A")){
						for(int k = 0; k<4; k++) {
							int nr = i + dr[k];
							int nc = j + dc[k];

							if (is_range(nr,nc,N)) {
								if(arr[nr][nc].equals("H")) {
									arr[nr][nc] = "X";
								}
							}
						}
					}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(arr[i][j].equals("H")) {
						answer++;
					}
				}
			}

			// 남은 H 개수 세기


			System.out.println("#" + test_case + " 결과값 : "+answer); // 실제 문제의 계산 로직 추가 필요
		}
		sc.close(); // Scanner 닫기
	}

	public static boolean is_range(int r, int c, int n) {
		return (0<=r && r<n ) && ( 0<=c && c<n);
	}

}