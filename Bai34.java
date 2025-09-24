import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N phải là một số nguyên dương.");
        } else {

            System.out.println("Các số từ 1 đến " + n + " là:");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}