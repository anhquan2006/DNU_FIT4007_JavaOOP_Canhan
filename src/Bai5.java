import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tuổi của sinh viên
        System.out.print("Nhập tuổi của sinh viên (tính đến năm 2023): ");
        int tuoi = sc.nextInt();

        // Tính năm sinh
        int namSinh = 2023 - tuoi;

        // In ra kết quả
        System.out.println("Năm sinh của sinh viên là: " + namSinh);

        sc.close();
    }
}
