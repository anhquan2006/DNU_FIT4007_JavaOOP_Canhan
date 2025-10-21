public class Bai61 {
    public static int multiply(int a, int b, int c) {

        return a * b * c;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;
        int num3 = 2;

        int result = multiply(num1, num2, num3);

        System.out.println("Ba số nguyên là: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Tích của ba số là: " + result); // Kết quả: 5 * 4 * 2 = 40
    }
}