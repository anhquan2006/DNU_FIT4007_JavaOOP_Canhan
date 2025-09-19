import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N phải là số nguyên dương!");
        } else {
            // Tính căn bậc 2
            double can = Math.sqrt(n);

            // Kiểm tra nếu căn bậc 2 là số nguyên
            if (can == (int) can) {
                System.out.println(n + " là số chính phương.");
            } else {
                System.out.println(n + " không phải là số chính phương.");
            }
        }

        sc.close();
    }
}
