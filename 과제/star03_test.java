import java.util.Scanner;

public class star3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("라인수 입력: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 두 대각선 위치에 별을 출력
                if (j == i || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}