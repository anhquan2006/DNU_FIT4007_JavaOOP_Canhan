import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm số: ");
        double score = sc.nextDouble();

        if (score >= 0 && score <= 10) {
            System.out.println(score + " là điểm số hợp lý.");
        } else {
            System.out.println(score + " không phải là điểm số hợp lý.");
        }

        sc.close();
    }
}
