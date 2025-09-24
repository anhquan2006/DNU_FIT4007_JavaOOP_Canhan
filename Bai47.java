import java.util.Scanner;
public class Bai47 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N phải là một số nguyên dương.");
        } else {

            long sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += (long) i * (i + 1);
            }

            System.out.println("Tổng của dãy số là: " + sum);
        }

        scanner.close();
    }
}