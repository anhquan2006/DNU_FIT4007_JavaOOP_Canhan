
public class DigitExtractor {
    // Bài 76
    public static int getLastDigit(int n) {
        int remainder = n % 10;
        return Math.abs(remainder);
    }

    public static void main(String[] args) {
        int num1 = -123;
        int lastDigit1 = getLastDigit(num1);
        System.out.println("Chữ số cuối cùng của " + num1 + " là: " + lastDigit1);

        // Ví dụ 2: Số dương
        int num2 = 4567;
        int lastDigit2 = getLastDigit(num2);
        System.out.println("Chữ số cuối cùng của " + num2 + " là: " + lastDigit2);

        // Ví dụ 3: Số âm kết thúc bằng 0
        int num3 = -90;
        int lastDigit3 = getLastDigit(num3);
        System.out.println("Chữ số cuối cùng của " + num3 + " là: " + lastDigit3);

        // Ví dụ 4: Số 0
        int num4 = 0;
        int lastDigit4 = getLastDigit(num4);
        System.out.println("Chữ số cuối cùng của " + num4 + " là: " + lastDigit4); 
    }
}