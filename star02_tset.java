import java.util.Scanner;

public class star2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		 System.out.print("라인수 입력 : ");
	        int n = s.nextInt();

	        // V형태 부분
	        for (int i = 0; i < n; i++) {
	            // 왼쪽 공백
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            // 왼쪽 별
	            System.out.print("*");

	            // 가운데 공백
	            for (int j = 0; j < (2 * (n - i - 1)) - 1; j++) {
	                System.out.print(" ");
	            }

	            // 오른쪽 별
	            if (i != n - 1) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	}

}