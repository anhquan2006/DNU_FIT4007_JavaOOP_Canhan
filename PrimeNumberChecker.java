public class PrimeNumberChecker {
// Bài 71
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 17;
        System.out.println(num1 + " có phải là số nguyên tố không? " + isPrime(num1));

        int num2 = 15;
        System.out.println(num2 + " có phải là số nguyên tố không? " + isPrime(num2));

        int num3 = 1;
        System.out.println(num3 + " có phải là số nguyên tố không? " + isPrime(num3));

        int num4 = 29;
        System.out.println(num4 + " có phải là số nguyên tố không? " + isPrime(num4));
    }
}