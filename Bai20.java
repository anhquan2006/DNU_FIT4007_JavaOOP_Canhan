import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số thực: ");
        double x = sc.nextDouble();

        int intX = (int) x;
        
        if (x == intX) {
            System.out.println(x + " là số nguyên.");
        } else {
            System.out.println(x + " không phải là số nguyên.");
        }

        sc.close();
    }
}
