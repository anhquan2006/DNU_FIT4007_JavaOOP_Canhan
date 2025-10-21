import java.util.Scanner;
public class Bai58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N (chiều cao tháp): ");

        int N = scanner.nextInt();
        scanner.close();

        System.out.println("\nKết quả tháp sao với N = " + N + ":");

        for (int i = 1; i <= N; i++) {
            String stars = "*".repeat(i);
            System.out.println(stars);
        }
    }
}