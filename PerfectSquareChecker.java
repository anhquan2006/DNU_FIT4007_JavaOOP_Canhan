public class PerfectSquareChecker {
    // Bài 78
    public static boolean isPerfectSquare(int n) {
        if (n <= 0) {
            return false;
        }

        double sqrtValue = Math.sqrt(n);
        long root = (long) sqrtValue;

        return (root * root == n);

    }

    public static void main(String[] args) {
        // Ví dụ 1: Số chính phương
        int num1 = 16;
        System.out.println(num1 + " có phải là số chính phương không? " + isPerfectSquare(num1));

        // Ví dụ 2: Không phải số chính phương
        int num2 = 14;
        System.out.println(num2 + " có phải là số chính phương không? " + isPerfectSquare(num2));

        // Ví dụ 3: Số chính phương lớn hơn
        int num3 = 100;
        System.out.println(num3 + " có phải là số chính phương không? " + isPerfectSquare(num3));

        // Ví dụ 4: Trường hợp không hợp lệ (số âm)
        int num4 = -25;
        System.out.println(num4 + " có phải là số chính phương không? " + isPerfectSquare(num4)); 
    }
}