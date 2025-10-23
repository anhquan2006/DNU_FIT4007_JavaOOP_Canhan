public class SumOfSquares {
    // Bài 75
    public static long calculateSumOfSquares(int n) {
        long total = 0;

        if (n <= 0) {
            return 0;
        }

        for (int i = 1; i <= n; i++) {
            total += (long)i * i;
        }

        return total;
    }

    public static long calculateSumOfSquaresFormula(int n) {
        if (n <= 0) {
            return 0;
        }

        long n_long = n;
        long sum = n_long * (n_long + 1) * (2 * n_long + 1) / 6;

        return sum;
    }

    public static void main(String[] args) {
        int n1 = 4;

        long sumLoop = calculateSumOfSquares(n1);
        System.out.println("Tính bằng Vòng lặp: S(" + n1 + ") = " + sumLoop);
        
    }
}