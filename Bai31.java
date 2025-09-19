import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        int result = 0;
        boolean valid = true;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;  /
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                    valid = false;
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Lỗi: Không thể chia lấy dư cho 0.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ!");
                valid = false;
        }

        if (valid) {
            System.out.println(a + " " + op + " " + b + " = " + result);
        }
    }
}
