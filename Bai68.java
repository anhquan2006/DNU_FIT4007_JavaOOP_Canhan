public class Bai68 {

    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello";
        System.out.println("Chuỗi ban đầu: " + inputString);
        System.out.println("Chuỗi đảo ngược: " + reverseString(inputString));
    }
}