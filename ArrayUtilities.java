import java.util.Arrays;
public class ArrayUtilities {
    // Bài 80
    public static void printArray(int[] a) {
        if (a == null) {
            System.out.println("Mảng là null.");
            return;
        }
        System.out.println(Arrays.toString(a));

    }
    // PHƯƠNG THỨC 2: ĐẢO NGƯỢC MẢNG

    public static int[] reverseArray(int[] originalArray) {
        if (originalArray == null || originalArray.length == 0) {
            return originalArray;
        }

        int n = originalArray.length;
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[n - 1 - i] = originalArray[i];
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        System.out.println("--- Ứng dụng Ví dụ 21 ---");

        // 1. In mảng gốc
        System.out.print("Mảng gốc:  ");
        printArray(original);

        // 2. Đảo ngược mảng và nhận mảng mới
        int[] reversed = reverseArray(original);

        // 3. In mảng đảo ngược
        System.out.print("Mảng đảo ngược: ");
        printArray(reversed);

        // Kiểm tra xem mảng gốc có bị thay đổi không
        System.out.print("\nKiểm tra mảng gốc: ");
        printArray(original);
    }
}