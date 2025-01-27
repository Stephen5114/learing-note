package com.itheima.hello;

public class HelloWordld {
    public static void main(String[] args) {

    }
    //一个类中，出现多个方法的名称相同，但是它们的形参列表是不同的，那么这些方法就称为方法重载,请把我写出这些示例代码
    public void test(){
        System.out.println("test");
    }
    public void test(int a){
        System.out.println("test");
    }
    public void test(int a,int b){
        System.out.println("test");
    }
    public void test(int a,int b,int c){
        System.out.println("test");
    }
    public void test(String a){
        System.out.println("test");
    }
    public void test(String a,String b){
        System.out.println("test");
    }
    public void test(String a,String b,String c){
        System.out.println("test");
    }
    public void test(int a,String b){
        System.out.println("test");
    }
    public void test(String a,int b){
        System.out.println("test");
    }
    public void test(int a,String b,String c){
        System.out.println("test");
    }
    public void test(String a,int b,String c){
        System.out.println("test");
    }
    public void test(String a,String b,int c){
        System.out.println("test");
    }
    public void test(int a,int b,String c){
        System.out.println("test");
    }

}
