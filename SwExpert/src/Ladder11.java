import java.util.Scanner;

public class Ladder11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = 1;
		int testCase = 1;
		int r = 0;
		int c = 0;
		int ans = 0;
		int dx[] = { 0, 0, -1 };// 왼,오,위
		int dy[] = { -1, 1, 0 };
		int ladder[][] = new int[100][100];
		while (T < 11) {
			testCase = scanner.nextInt();
			for (int i = 0; i < 100; i++) { // 배열 생성
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = scanner.nextInt();
				}
			}

			for (int i = 99; i >= 0; i--) {
				for (int j = 99; j >= 0; j--) {
					if (ladder[i][j] == 2) {
						r = i;
						c = j;
					}
				}
			}

			while (r != 0) {
				for (int i = 0; i < 3; i++) {
					if (r + dx[i] >= 0 && r + dx[i] < 100 && c + dy[i] >= 0 && c + dy[i] < 100) {
						if (ladder[r + dx[i]][c + dy[i]] == 1) {
							ladder[r + dx[i]][c + dy[i]] = 3;
							r = r + dx[i];
							c = c + dy[i];
							ans = c;

						}

					}
					
				}

			}
			System.out.print("#" + testCase + " " + ans);
			T++;
		}
	}
}
