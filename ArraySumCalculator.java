public class ArraySumCalculator {
    //Bài 74
    public static int calculateArraySum(int[] arr) {
        int total = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }

        for (int element : arr) {
            total += element;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int sum1 = calculateArraySum(array1);
        System.out.println("Tổng của mảng {10, 20, 30, 40, 50} là: " + sum1);

        int[] array2 = {5, -10, 15, -20};
        int sum2 = calculateArraySum(array2);
        System.out.println("Tổng của mảng {5, -10, 15, -20} là: " + sum2);

        int[] array3 = {};
        int sum3 = calculateArraySum(array3);
        System.out.println("Tổng của mảng rỗng {} là: " + sum3);

        int[] array4 = null;
        int sum4 = calculateArraySum(array4);
        System.out.println("Tổng của mảng null là: " + sum4); 
    }
}