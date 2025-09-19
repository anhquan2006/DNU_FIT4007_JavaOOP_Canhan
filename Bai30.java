import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ký tự (N/S/W/E): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'N':
                System.out.println("Hướng Bắc");
                break;
            case 'S':
                System.out.println("Hướng Nam");
                break;
            case 'W':
                System.out.println("Hướng Đông");
                break;
            case 'E':
                System.out.println("Hướng Tây");
                break;
            default:
                System.out.println("Ký tự không hợp lệ! Vui lòng nhập N, S, W hoặc E.");
        }
    }
}
