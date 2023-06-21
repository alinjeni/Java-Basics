package com.onbill.java.programs;

public class StaticEx {
    private static int outerStaticVariable = 10;
    private int outerInstanceVariable = 20;

    public static class StaticNestedClass {
        private int nestedVariable = 30;
        public void nestedMethod() {
            System.out.println("Nested Variable: " + nestedVariable);
            System.out.println("Outer Static Variable: " + outerStaticVariable);
        }
    }

    public static void main(String[] args) {
        StaticEx.StaticNestedClass nestedObj = new StaticEx.StaticNestedClass();
        nestedObj.nestedMethod();
    }
}
