import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập vào một số nguyên N: ");
        int n = sc.nextInt();

        // Lấy chữ số cuối cùng (dùng Math.abs để tránh số âm)
        int chuSoCuoi = Math.abs(n % 10);

        // In ra kết quả
        System.out.println("Chữ số cuối cùng của " + n + " là: " + chuSoCuoi);

        sc.close();
    }
}
