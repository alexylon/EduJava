package me.alexandroff.oca.practice;

class Base {
    public Object getValue() {
        return new Object();
    } //1
}

class Base2 extends Base {
    public String getValue() {
        return "hello";
    } //2
}

class TestClass {
    public static void main(String[] args) {
        Base b = new Base2();
        System.out.println(b.getValue()); //3
    }
}
