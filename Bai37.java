import java.util.Scanner;

public class Bai37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N phải là một số nguyên dương.");
        } else {
            System.out.println("Các số tự nhiên chẵn nhỏ hơn hoặc bằng " + n + " là:");

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}