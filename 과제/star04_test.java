import java.util.Scanner;

public class star4 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("라인수 입력 : ");
        int len = s.nextInt();

        // 상단 다이아몬드
        for (int i = 0; i < len; i++) {
   
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print(" ");
            }
    
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 하단 다이아몬드
        for (int i = len - 2; i >= 0; i--) {
            
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}