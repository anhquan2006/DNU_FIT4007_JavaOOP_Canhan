import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào một số nguyên N
        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();

        // Kiểm tra điều kiện
        if (N >= 0) {
            System.out.println(N + " là số tự nhiên.");
        } else {
            System.out.println(N + " không phải là số tự nhiên.");
        }

        sc.close();
    }
}
