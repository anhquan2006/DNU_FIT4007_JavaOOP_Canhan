import java.util.Scanner;

public class Bai42 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Nhập vào một số nguyên dương N (1 <= N <= 9): ");
            n = scanner.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("Số N không hợp lệ. Vui lòng nhập lại số từ 1 đến 9.");
            }
        } while (n < 1 || n > 9);

        System.out.println("Bảng cửu chương của " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}