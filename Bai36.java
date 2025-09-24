import java.util.Scanner;

public class Bai36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N phải là một số nguyên dương.");
        } else {

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
        }
        scanner.close();
    }
}