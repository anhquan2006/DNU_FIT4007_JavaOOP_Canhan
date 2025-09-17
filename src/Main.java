import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();

        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("\nThông tin sản phẩm:");
        product.showInfo();

        scanner.close();
    }
}