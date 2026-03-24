class TriangleArea {
    public void method1() {
        double base = 5, height = 4;
        double area = 0.5 * base * height;
        System.out.println("Method 1 Area = " + area);
    }
    public void method2(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Method 2 Area = " + area);
    }
    public double method3() {
        double base = 6, height = 3;
        return 0.5 * base * height;
    }
    public double method4(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        TriangleArea obj = new TriangleArea();

        obj.method1();

        obj.method2(7, 2);

        double result3 = obj.method3();
        System.out.println("Method 3 Area = " + result3);

        double result4 = obj.method4(8, 5);
        System.out.println("Method 4 Area = " + result4);
    }
}