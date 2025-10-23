public class FactorialZeroCounter {
    // Bài 79
    public static int countTrailingZeros(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n phải là số không âm.");
        }
        if (n == 0 || n == 1) {
            return 0;
        }

        int zeroCount = 0;

        for (int powerOf5 = 5; powerOf5 <= n; powerOf5 *= 5) {
            zeroCount += n / powerOf5;
        }

        return zeroCount;
    }

    public static void main(String[] args) {
        // Ví dụ 1: n = 5
        // 5! = 120 (có 1 chữ số 0)
        int n1 = 5;
        System.out.println("Số chữ số 0 cuối cùng của " + n1 + "! là: " + countTrailingZeros(n1));

        // Ví dụ 2: n = 10
        // 10! = 3,628,800 (có 2 chữ số 0)
        int n2 = 10;
        System.out.println("Số chữ số 0 cuối cùng của " + n2 + "! là: " + countTrailingZeros(n2));

        // Ví dụ 3: n = 25
        // Lần 1: 25/5 = 5. Lần 2: 25/25 = 1. Tổng = 6. (Có 6 chữ số 0)
        int n3 = 25;
        System.out.println("Số chữ số 0 cuối cùng của " + n3 + "! là: " + countTrailingZeros(n3));

        // Ví dụ 4: Số lớn
        int n4 = 100;
        // 100/5 + 100/25 + 100/125 = 20 + 4 + 0 = 24
        System.out.println("Số chữ số 0 cuối cùng của " + n4 + "! là: " + countTrailingZeros(n4));
    }
}