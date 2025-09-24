import java.util.Scanner;

public class Bai48 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 5 số nguyên:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Mảng vừa nhập là: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}