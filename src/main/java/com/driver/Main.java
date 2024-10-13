package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        B obj2 = new B();
        System.out.println(B.meth());
    }
}
class A {
    A() {
    }

    public static String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    B() {
    }

    public static String callA() {
        return A.meth();
    }

    public static String meth() {
        return "Method is overridden in Extended class B";
    }
}