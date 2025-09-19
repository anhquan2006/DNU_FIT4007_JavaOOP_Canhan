import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài: ");
        int chieuDai = sc.nextInt();

        System.out.print("Nhập chiều rộng: ");
        int chieuRong = sc.nextInt();

        // Kiểm tra điều kiện
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Chiều dài và chiều rộng phải lớn hơn 0.");
        } else if (chieuDai == chieuRong) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây là hình chữ nhật.");
        }

        sc.close();
    }
}
