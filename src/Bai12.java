import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        sc.close();
    }
}
