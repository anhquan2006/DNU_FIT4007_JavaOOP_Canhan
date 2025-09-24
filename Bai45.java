import java.util.Scanner;
public class Bai45 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số tự nhiên N: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("N phải là một số tự nhiên (không âm).");
        } else {
            int originalN = n;
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            System.out.println("Tổng các chữ số của " + originalN + " là: " + sum);
        }
        scanner.close();
    }
}