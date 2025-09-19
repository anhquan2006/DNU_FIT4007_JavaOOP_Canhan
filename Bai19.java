import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 số nguyên
        System.out.print("Nhập góc a: ");
        int a = sc.nextInt();
        System.out.print("Nhập góc b: ");
        int b = sc.nextInt();
        System.out.print("Nhập góc c: ");
        int c = sc.nextInt();

        // Kiểm tra điều kiện góc tam giác
        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " là độ lớn 3 góc của một tam giác.");
        } else {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " KHÔNG phải là độ lớn 3 góc của một tam giác.");
        }

        sc.close();
    }
}
