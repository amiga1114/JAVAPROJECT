import java.util.Scanner;

public class Ladder10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = 1;
		int testCase = 1;
		int r = 0;
		int c = 0;
		int ans = 0;
		int dx[] = { 0, -1, 0 };// 왼,위,오
		int dy[] = { -1, 0, 1 };
		int ladder[][] = new int[10][10];

		testCase = scanner.nextInt();
		for (int i = 0; i < 10; i++) { // 배열 생성
			for (int j = 0; j < 10; j++) {
				ladder[i][j] = scanner.nextInt();
			}
		}

		for (int i = 9; i >= 0; i--) {
			for (int j = 9; j > 0; j--) {
				if (ladder[i][j] == 2) {
					r = i;
					c = j;
				}
			}
		}

		while (r != 0) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (r + dx[i] >= 0 && r + dx[i] < 10 && c + dy[j] >= 0 && c + dy[j] < 10) {
						if (ladder[r + dx[i]][c + dy[j]] == 1) {
							ladder[r][c] = 3;
							r = r + dx[i];
							c = c + dy[j];

						}
					}
				}
				ans = c;

			}

		}
		
		System.out.print("#");
		System.out.print(testCase);
		System.out.print(" ");
		System.out.println(ans);

	}

}