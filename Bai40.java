import java.util.Scanner;

public class Bai40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N phải là một số nguyên dương.");
        } else {

            if (n == 1) {
                System.out.println(n + " là một lũy thừa của 2.");
            } else {
                boolean isPowerOfTwo = true;
                int temp = n;

                while (temp > 1) {
                    if (temp % 2 != 0) {
                        isPowerOfTwo = false;
                        break;
                    }
                    temp /= 2;
                }

                if (isPowerOfTwo) {
                    System.out.println(n + " là một lũy thừa của 2.");
                } else {
                    System.out.println(n + " không phải là một lũy thừa của 2.");
                }
            }
        }

        scanner.close();
    }
}