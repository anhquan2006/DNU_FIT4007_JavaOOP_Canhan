public class Bai65 {

    public static String reverseString(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello";

        String reversedString = reverseString(inputString);

        System.out.println("Chuỗi ban đầu: " + inputString);
        System.out.println("Chuỗi đảo ngược: " + reversedString);
    }
}