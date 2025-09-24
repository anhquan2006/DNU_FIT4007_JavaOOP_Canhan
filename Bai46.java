import java.util.Scanner;

public class Bai46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.println("Các ký tự trong tên của bạn là:");

        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            System.out.println(character);
        }
        scanner.close();
    }
}