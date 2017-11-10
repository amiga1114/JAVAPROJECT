import java.util.Arrays;
import java.util.Scanner;

public class dump {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = 0;
		int max = 0;
		int min = 0;
		int ans = 0;
		int dump[] = new int[100];

		while (T < 10) {
			int cnt = scanner.nextInt();
			for (int i = 0; i < dump.length; i++) {
				dump[i] = scanner.nextInt();
			}
			for (int i = 0; i < cnt; i++) {
				Arrays.sort(dump);
				dump[0] = dump[0] + 1;
				dump[99] = dump[99] - 1;
				Arrays.sort(dump);
				ans = dump[99] - dump[0];
			}
		
				System.out.print("#");
				System.out.print(T+1);
				System.out.print(" ");
				System.out.println(ans);
			
			T++;
		}

	}

}
