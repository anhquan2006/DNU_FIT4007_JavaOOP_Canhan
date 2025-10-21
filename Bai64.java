public class Bai64 {
    public static long calculateFactorial(int N) {

        if (N < 0) {
            throw new IllegalArgumentException("N phải là số nguyên không âm.");
        }
        if (N == 0 || N == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int testN = 5;
        long factorial = calculateFactorial(testN);

        System.out.println(testN + "! (Giai thừa) là: " + factorial);

        int testM = 10;
        long factorial2 = calculateFactorial(testM);
        System.out.println(testM + "! (Giai thừa) là: " + factorial2);
    }
}