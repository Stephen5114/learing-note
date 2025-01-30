# learing-note
Day1 一个类中，出现多个方法的名称相同，但是它们的形参列表是不同的，那么这些方法就称为方法重载了。方法重载只关心方法名称相同，形参列表不同（类型不同，个数不同，顺序不同），其他都无所谓。

Day2 在表达式中，小范围类型的变量，会自动转换成表达式中较大范围的类型，再参与运算.
byte、short、char -> int -> long -> float -> double
Please note: 在表达式中,byte,short,char是直接转换成int类型参与运算的.
Scanner sc = new Scanner(system.in);
int age = sc.nextInt();
String name = sc.next();
