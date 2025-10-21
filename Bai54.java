public class Bai54 {
    public static void main(String[] args) {

        String inputString = "Viết chương trình đếm số từ trong một chuỗi";

        String[] words = inputString.split(" ");

        int wordCount = words.length;

        System.out.println("Chuỗi ban đầu: \"" + inputString + "\"");
        System.out.println("Số từ đã đếm được: " + wordCount);
    }
}