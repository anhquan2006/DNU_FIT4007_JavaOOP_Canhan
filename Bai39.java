import java.util.Scanner;

public class Bai39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập vào một số nguyên N (N > 0): ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập lại.");
            }
        } while (n <= 0);

        System.out.println("Bạn đã nhập thành công số: " + n);

        scanner.close();
    }
}