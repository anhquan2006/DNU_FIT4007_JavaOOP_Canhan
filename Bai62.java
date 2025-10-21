public class Bai62 {

    public static boolean isNaturalNumber(int number) {

        return number >= 0;
    }

    public static void main(String[] args) {
        int test1 = 5;
        int test2 = 0;
        int test3 = -10;

        System.out.println(test1 + " có phải là số tự nhiên không? " + isNaturalNumber(test1));
        System.out.println(test2 + " có phải là số tự nhiên không? " + isNaturalNumber(test2));
        System.out.println(test3 + " có phải là số tự nhiên không? " + isNaturalNumber(test3));
    }
}