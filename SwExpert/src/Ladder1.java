import java.util.Scanner;

public class Ladder1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = 0;
		int r = 0;
		int c = 0;
		int ans = 0;
		int dx[] = { 0, 1, 0 };// ¿Þ,¹Ø,¿À
		int dy[] = { -1, 0, 1 };
		int ladder[][] = new int[100][100];
		int ladder1[][] = new int[100][100];
		while (T < 11) {
			T = scanner.nextInt();
			for (int i = 0; i < 100; i++) { // ¹è¿­ »ý¼º
				for (int j = 0; j < 100; j++) {
					ladder1[i][j] = scanner.nextInt();
				}
			}
			
			for (int k = 0; k < 100; k++) {
				for (int j = 0; j < 100; j++) {
					ladder[k][j] = ladder1[k][j];
				}
			}

			for (int i = 0; i < 100; i++) {
				if (ladder[0][i] == 1) {
					for (int k = 0; k < 100; k++) {
						for (int j = 0; j < 100; j++) {
							ladder[i][j] = ladder1[i][j];
							if(ladder[i][j]==3) {
								ladder[i][j]=1;
							}
						}
					}
					r = 0;
					c = i;
					ans = i;
					while (r < 100) {
						if (ladder[r][c] == 1) {
							if (c == 0) { // °¡Àå ¿ÞÂÊ
								if (ladder[r][c + dy[2]] == 1) { // ¿À¸¥ÂÊ¿¡ 1ÀÌ´Ù.
									ladder[r][c] = 3;
									r = r;
									c = c + dy[2]; // ¿­ÀÌ ¹Ù²ñ
									// ladder[r][c - dy[2]] = 1;
								} else {
									ladder[r][c] = 3;
									r = r + dx[1];
									c = c;
									// ladder[r - dx[1]][c] = 1;
								}
							} else if (c == 99) {
								if (ladder[r][c + dy[0]] == 1) {
									ladder[r][c] = 3;
									r = r;
									c = c + dy[0];
									// ladder[r][c - dy[0]] = 1;
								} else {
									ladder[r][c] = 3;
									r = r + dx[1];
									c = c;
									// ladder[r - dx[1]][c] = 1;
								}
							} else {
								if (ladder[r][c + dy[0]] == 1) {
									ladder[r][c] = 0;
									r = r;
									c = c + dy[0];
									// ladder[r][c - dy[0]] = 1;
								} else if (ladder[r][c + dy[2]] == 1) {
									ladder[r][c] = 3;
									r = r;
									c = c + dy[2];
									// ladder[r][c - dy[2]] = 1;
								} else {
									ladder[r][c] = 3;
									r = r + dx[1];
									c = c;
									// ladder[r - dx[1]][c] = 1;
								}
							}
						}
						if (r == 99 && ladder[r][c] == 2) {
							break;
						}
					}
				}
			}
			System.out.print("#");
			System.out.print(T);
			System.out.print(" ");
			System.out.println(ans);
			T++;
		}
	} 
}