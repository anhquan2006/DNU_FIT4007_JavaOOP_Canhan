import java.util.Scanner;

public class Bai38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương S: ");
        int s = scanner.nextInt();

        if (s <= 0) {
            System.out.println("S phải là một số nguyên dương.");
        } else {
            int n = 0;
            int sum = 0;

            while (sum + (n + 1) <= s) {
                n++;
                sum += n;
            }

            System.out.println("Số nguyên dương N nhỏ nhất thỏa mãn là: " + n);
        }
        scanner.close();
    }
}