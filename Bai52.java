public class Bai52 {
    public static void main(String[] args) {

        String inputString = "Java is an amazing language!";

        char targetChar = 'a';

        int count = 0;

        String lowerCaseString = inputString.toLowerCase();

        for (int i = 0; i < lowerCaseString.length(); i++) {
            if (lowerCaseString.charAt(i) == targetChar) {
                count++;
            }
        }
        
        System.out.println("Chuỗi ban đầu: " + inputString);
        System.out.println("Ký tự cần đếm: '" + targetChar + "' (không phân biệt hoa thường)");
        System.out.println("Số lần xuất hiện: " + count);
    }
}