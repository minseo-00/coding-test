import java.util.Scanner;

public class star1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("라인수 입력: ");
        int n = s.nextInt();
        
        // 물결 모양 출력
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // 짝수 번째 줄은 별만 출력
                System.out.print("*");
            } else {
                // 홀수 번째 줄은 공백 후 별을 출력
                System.out.print(" *");
            }
            
            System.out.println();
        }
    }
}
