package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        A obj = new B();
        obj.meth();

        B obj1 = new B();
        obj1.meth();
    }
}
