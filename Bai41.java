import java.util.Scanner;
public class Bai41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("N phải là một số nguyên không âm.");
        } else {

            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Giai thừa của " + n + " (N!) là: " + factorial);
        }

        scanner.close();
    }
}