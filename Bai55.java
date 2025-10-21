public class Bai55 {
    public static boolean containsDigitRegex(String str) {
        return str.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        String test1 = "abc1xyz";
        String test2 = "javaprogram";
        String test3 = "12345";

        System.out.println("\"" + test1 + "\" có chứa số: " + containsDigitRegex(test1));
        System.out.println("\"" + test2 + "\" có chứa số: " + containsDigitRegex(test2));
        System.out.println("\"" + test3 + "\" có chứa số: " + containsDigitRegex(test3));
    }
}