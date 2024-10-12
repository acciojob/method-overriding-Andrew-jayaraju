package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj1 = new B();
        System.out.println(obj1.meth());

        B obj2 = new B();
        System.out.println(obj2.meth());
    }
}

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    public String meth(){
        return "Method is overridden in Extended class B";
    }
}