import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập vào một số nguyên N (có ít nhất 2 chữ số): ");
        int n = sc.nextInt();

        // Lấy trị tuyệt đối để xử lý số âm
        int soNguyenDuong = Math.abs(n);

        // Tìm chữ số gần cuối
        int chuSoGanCuoi = (soNguyenDuong / 10) % 10;

        // In ra kết quả
        System.out.println("Chữ số gần cuối của " + n + " là: " + chuSoGanCuoi);

        sc.close();
    }
}
