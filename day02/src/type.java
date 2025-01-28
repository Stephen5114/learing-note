package day02.src;

public class type {
    public static void main(String[] args) {
        int result = calc2((byte)110,(byte)120);
        System.out.println(result);

        int result2 = calc3((byte)110,(byte)120);
        System.out.println(result2);

        System.out.println(calc(110,120,3.14,'+'));
    }
    public static double calc(int a, int b, double c, char r){
        return a+b+c+r;
    }
    public static int calc2(byte a, byte b){
        return a+b;
    }
    public static byte calc3(byte a, byte b){
        return (byte) (a+b);
    }
}

