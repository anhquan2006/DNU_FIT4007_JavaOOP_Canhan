import java.util.Scanner;

public class Bai44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên N: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println(n + " không phải là số nguyên tố.");
        } else {
            int count = 0; // Biến đếm số ước
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n + " là số nguyên tố.");
            } else {
                System.out.println(n + " không phải là số nguyên tố.");
            }
        }
        scanner.close();
    }
}