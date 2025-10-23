public class BinaryConverter {
    // Bài 74
    public static String convertToBinaryBuiltIn(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Số phải là số tự nhiên (>= 0).");
        }
        return Integer.toBinaryString(n);
    }
    public static String convertToBinaryManual(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Số phải là số tự nhiên (>= 0).");
        }
        if (n == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();
        int temp = n;

        while (temp > 0) {
            int remainder = temp % 2;
            binaryString.insert(0, remainder);
            temp = temp / 2;
        }

        return binaryString.toString();
    }

    public static void main(String[] args) {
        int number = 7;

        String binary1 = convertToBinaryBuiltIn(number);
        System.out.println("Sử dụng Built-in: binary(" + number + ") = \"" + binary1 + "\"");

        String binary2 = convertToBinaryManual(number);
        System.out.println("Sử dụng Manual:   binary(" + number + ") = \"" + binary2 + "\"");

        int number2 = 42;
        String binary3 = convertToBinaryManual(number2);
        System.out.println("\nSử dụng Manual:   binary(" + number2 + ") = \"" + binary3 + "\"");

        int number3 = 0;
        String binary4 = convertToBinaryManual(number3);
        System.out.println("Sử dụng Manual:   binary(" + number3 + ") = \"" + binary4 + "\"");   
    }
}