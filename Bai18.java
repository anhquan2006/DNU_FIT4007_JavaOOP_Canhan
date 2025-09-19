import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 số nguyên
        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        // Kiểm tra điều kiện
        if (a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " là độ dài 3 cạnh của một tam giác.");
        } else {
            System.out.println("Ba số " + a + ", " + b + ", " + c + " KHÔNG phải là 3 cạnh của một tam giác.");
        }

        sc.close();
    }
}
