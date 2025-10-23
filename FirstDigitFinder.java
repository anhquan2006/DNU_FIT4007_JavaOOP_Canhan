public class FirstDigitFinder {
      // Bài 77
    public static int getFirstDigit(int n) {
        int number = Math.abs(n);

        if (number == 0) {
            return 0;
        }

        while (number >= 10) {
            number = number / 10;
        }

        return number;
    }

    public static void main(String[] args) {
        // Ví dụ 1: Như trong đề bài
        int num1 = 123;
        int firstDigit1 = getFirstDigit(num1);
        System.out.println("Chữ số đầu tiên của " + num1 + " là: " + firstDigit1);

        // Ví dụ 2: Số lớn
        int num2 = 98765;
        int firstDigit2 = getFirstDigit(num2);
        System.out.println("Chữ số đầu tiên của " + num2 + " là: " + firstDigit2);

        // Ví dụ 3: Số một chữ số
        int num3 = 5;
        int firstDigit3 = getFirstDigit(num3);
        System.out.println("Chữ số đầu tiên của " + num3 + " là: " + firstDigit3);

        // Ví dụ 4: Trường hợp số âm 
        int num4 = -456;
        int firstDigit4 = getFirstDigit(num4);
        System.out.println("Chữ số đầu tiên của " + num4 + " là: " + firstDigit4);
    }
}