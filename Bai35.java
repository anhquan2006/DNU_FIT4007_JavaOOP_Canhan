import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N phải là một số nguyên dương.");
        } else {

            System.out.println("Các số từ " + n + " giảm 1 là:");
            for (int i = n; i >= 1; i--) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}