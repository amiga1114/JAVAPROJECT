import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int testCase = 1;
		int v = 0;
		int e = 0;
		int n1 = 0;
		int n2 = 0;
		int[] arr = new int[v + e - 1];

		while (testCase < 11) {
			v = scanner.nextInt();
			e = scanner.nextInt();
			n1 = scanner.nextInt();
			n2 = scanner.nextInt();

			for (int i = 0; i < v + e - 1; i++) {
				arr[i] = scanner.nextInt();
			}

			
			testCase++;
			System.out.println("#" + testCase + " ");
		}
	}

}
