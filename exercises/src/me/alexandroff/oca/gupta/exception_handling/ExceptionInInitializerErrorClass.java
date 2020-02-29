package me.alexandroff.oca.gupta.exception_handling;

//The ExceptionInInitializerError error
//is typically thrown by the JVM when a static
//initializer in your code throws any type of
//RuntimeException.

public class ExceptionInInitializerErrorClass {

    static {
        int num = Integer.parseInt("f1", 16);
        System.out.println(num);

        int num2 = Integer.parseInt("sd", 16);
        //Throws ExceptionInInitializerError
    }

    public static void main(String[] args) {
        System.out.println("Hello from 'main'");
    }
}

class DemoExceptionInInitializerError {
    //static variable results in ExceptionInInitializerError
    // caused by NullPointerException
    static String name = null;
    static int nameLength = name.length();

    public static void main(String[] args) {

    }
}

class DemoExceptionInInitializerError1 {
    String name = null;
    int nameLength = name.length();

    public static void main(String[] args) {
        DemoExceptionInInitializerError1 obj = new DemoExceptionInInitializerError1();
        System.out.println(obj.nameLength);
        //NullPointerException
    }
}

class DemoExceptionInInitializerError2 {
    static String name = getName();

    static String getName() {
        throw new MyException();
    }

    public static void main(String[] args) {

    }
}

class MyException extends RuntimeException {
}
