import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tên
        System.out.print("Nhập vào tên của bạn: ");
        String ten = sc.nextLine();

        // Lấy độ dài của chuỗi
        int doDai = ten.length();

        // In ra kết quả
        System.out.println("Độ dài tên của bạn là: " + doDai);

        sc.close();
    }
}
