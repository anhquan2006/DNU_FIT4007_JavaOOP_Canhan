public class TriangleAreaCalculator {

    public static double calculateArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Lỗi: Ba cạnh không tạo thành một tam giác hợp lệ.");
            return -1.0;
        }

        double p = (a + b + c) / 2.0;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }
    public static void main(String[] args) {
        // Ví dụ 1: 3, 4, 5 (Tam giác vuông)
        double a1 = 3;
        double b1 = 4;
        double c1 = 5;
        double area1 = calculateArea(a1, b1, c1);
        System.out.println("Diện tích tam giác (3, 4, 5) là: " + area1);

        double a2 = 5;
        double b2 = 5;
        double c2 = 5;
        double area2 = calculateArea(a2, b2, c2);
        System.out.println("Diện tích tam giác (5, 5, 5) là: " + String.format("%.2f", area2));

        double a3 = 1;
        double b3 = 2;
        double c3 = 10;
        double area3 = calculateArea(a3, b3, c3); 
        System.out.println("Diện tích tam giác (1, 2, 10) là: " + area3);
    }
}