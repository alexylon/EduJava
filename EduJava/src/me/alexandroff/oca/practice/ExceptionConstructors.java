package me.alexandroff.oca.practice;

//Therefore, if a subclass constructor invokes a superclass constructor
// that throws an exception, that subclass constructor MUST also declare
// that exception in its throws clause.


public class ExceptionConstructors {
    ExceptionConstructors() throws Exception {
    }

    ExceptionConstructors(String str) {

    }
}

class SubExceptionConstructors extends ExceptionConstructors {
    SubExceptionConstructors() throws Exception {
    }

    SubExceptionConstructors(int a) throws Exception {
    }

    SubExceptionConstructors(String str){
        super(str);
    }
}
