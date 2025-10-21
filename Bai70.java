public class Bai70 {
    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("Chuỗi đảo ngược: " + reverseString(input)); 
    }
}