import java.util.Scanner;
public class Bai50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương N (số phần tử của mảng): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N phải là một số nguyên dương.");
        } else {
            int[] a = new int[n];

            System.out.println("Nhập " + n + " phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                a[i] = scanner.nextInt();
            }

            System.out.print("Mảng in ra theo thứ tự ngược lại là: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
        }

        scanner.close();
    }
}