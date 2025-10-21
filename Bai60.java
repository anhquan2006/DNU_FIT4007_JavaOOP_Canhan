public class Bai60 {

    public static int sum(int a, int b) {
        // Trả về tổng của hai tham số
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 7;

        int result = sum(num1, num2);
        
        System.out.println("Số thứ nhất: " + num1);
        System.out.println("Số thứ hai: " + num2);
        System.out.println("Tổng của " + num1 + " và " + num2 + " là: " + result); // Kết quả: 22
    }
}