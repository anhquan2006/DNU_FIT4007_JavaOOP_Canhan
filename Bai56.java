public class Bai56 {

    public static boolean isPangram(String str) {

        boolean[] alphabetPresent = new boolean[26];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                index = c - 'A';
            }
            else if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            } else {
                continue;
            }

            alphabetPresent[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (alphabetPresent[i] == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "Jumping over the lazy dogs";
        System.out.println("Chuỗi 1: \"" + test1 + "\" là Pangram? " + isPangram(test1));
        System.out.println("Chuỗi 2: \"" + test2 + "\" là Pangram? " + isPangram(test2));
    }
}