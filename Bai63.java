public class Bai63 {
    public static void main(String[] args) {

        String inputString = "Hello";

        StringBuilder stringBuilder = new StringBuilder(inputString);

        String reversedString = stringBuilder.reverse().toString();
        
        System.out.println("Chuỗi ban đầu: " + inputString);
        System.out.println("Chuỗi đảo ngược: " + reversedString);
    }
}