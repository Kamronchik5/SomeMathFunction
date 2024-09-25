public class MathFunctions {
    static double p = 3.14F;
    static double e = 2.71D;
    public static void getArea(int r) {
        System.out.println(p * r * r);
    }
    public static void getLevel(int a){
        double result = 1;
        for (int i = 1; i <= a; i++) {
            result *= e;
        }
        System.out.println(result);
    }

    public static void getTriangleArea(int a , int b , int c){
        double p = (a+b+c)/2;
        double s = p*(p-a)*(p-b)*(p-c);
        System.out.println(Math.sqrt(s));
    }
}
