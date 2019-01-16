package me.alexandroff.oca.practice;

//!!!
public class ExceptionConstructor {
    int i = 5;

    {
        if (i == 0) throw new Exception();
    }

    //If a checked exception is thrown by an instance initializer,
    //this exception (or a super-exception) MUST be declared by ALL constructors
    //Default constructors are NOT allowed in this scenario

    ExceptionConstructor() throws Throwable {
    }

    ExceptionConstructor(int x) throws Exception {
    }

    /*
    static {
        if (i == 0) throw new Exception();
    }
    */
    //static initializers CANNOT throw checked exceptions
}


