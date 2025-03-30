import java.util.Scanner;

public class star2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("라인수 입력 : ");
        int n = s.nextInt();

        // 트리 부분
        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 나무 밑동 (가장 넓은 부분의 별 개수와 일치)
        for (int i = 0; i < 2; i++) {  // 밑동을 2줄로 출력
            for (int j = 0; j < n - 2; j++) {  // 공백을 적절히 설정
                System.out.print(" ");
            }
            System.out.println("***");  // 트리의 맨 마지막 줄의 별 개수와 일치
        }
    }
}
