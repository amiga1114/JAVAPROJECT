import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = 0;
		int ans = 0;
		int max = 0;
		int[] area = new int[1000];
		int[] cnt = new int[101];

		while (t < 10) {
			t = scanner.nextInt();
			for (int i = 0; i < 1000; i++) {
				area[i] = scanner.nextInt();
			}

			for (int i = 0; i < 101; i++) {
				cnt[i] = 0;
			}

			for (int i = 0; i < 1000; i++) {
				for (int j = 0; j < 101; j++) {
					if (area[i] == j) {
						cnt[j]++;
					}
				}

			}
			for (int i = 0; i < 101; i++) {
				if (cnt[i] >= max) {
					max = cnt[i];
					ans = i;
				}
			}
			System.out.println("#" + t + " " + ans);
			max = 0;
			ans = 0;
		}

	}

}
