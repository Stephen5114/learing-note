package day02.src.scanner;

public class scanner {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入一个浮点数：");
        double b = sc.nextDouble();
        System.out.println("请输入一个字符：");
        char c = sc.next().charAt(0);
        System.out.println("请输入一个字符串：");
        String d = sc.next();
        System.out.println("您输入的整数是：" + a);
        System.out.println("您输入的浮点数是：" + b);
        System.out.println("您输入的字符是：" + c);
        System.out.println("您输入的字符串是：" + d);
        sc.close();
    }
}
