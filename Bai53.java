public class Bai53 {
    public static boolean isPalindrome(String str) {

        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        String test1 = "racecar";
        String test2 = "hello";
        String test3 = "Madam";

        System.out.println("\"" + test1 + "\" có phải là chuỗi đối xứng không? " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" có phải là chuỗi đối xứng không? " + isPalindrome(test2));
        System.out.println("\"" + test3 + "\" có phải là chuỗi đối xứng không? " + isPalindrome(test3));
    }
}