import java.util.HashMap;
import java.util.Map;
public class Bai59 {

    public static void countAndDisplayCharacters(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        System.out.println("Kết quả đếm ký tự trong chuỗi \"" + str + "\":");

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();

            System.out.println(character + " xuất hiện " + count + " lần");
        }
    }

    public static void main(String[] args) {
        String testString = "Hello";
        countAndDisplayCharacters(testString);
        System.out.println("\n-----------------");
        countAndDisplayCharacters("programming");
    }
}