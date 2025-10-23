public class StringPrinter {
    // Bài 72
    public static void printStringNTimes(String s, int n) {
        if (n <= 0) {
            System.out.println("Số lần lặp không hợp lệ (n phải lớn hơn 0).");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String myString = "Xin chào, đây là ví dụ 12!";
        int repetitions = 4;

        System.out.println("--- Bắt đầu in chuỗi '" + myString + "' " + repetitions + " lần ---");

        printStringNTimes(myString, repetitions);

        System.out.println("--- Kết thúc ---");

        printStringNTimes("Java is fun", 2);
    }
}