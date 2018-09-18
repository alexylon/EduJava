package me.alexandroff.oca.gupta.exception_handling;

//// !!! If a catch block returns an OBJECT data type,
////the finally block MODIFIES the value being returned by it

public class MultipleReturn3 {
    StringBuilder getStringBuilder() {
        StringBuilder returnVal = new StringBuilder("10");
        try {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        } catch (Exception e) {
            System.out.println("About to return :" + returnVal);
            return returnVal;
        } finally {
            returnVal.append("10");
            System.out.println("Return value is now :" + returnVal);
        }
        return returnVal;
    }

    public static void main(String args[]) {
        MultipleReturn3 var = new MultipleReturn3();
        System.out.println("In Main:" + var.getStringBuilder());
    }
}

// Output:

//About to return :10
//Return value is now :1010
//In Main:1010

//In this case, the catch block returns an object of the class StringBuilder. When the
//finally block executes, it can access the value of the object referred to by the variable
//returnVal and can modify it. The modified value is returned to the method main.
// !!! Remember that primitives are passed by value and objects are passed by reference.

//EXAM TIP:
// Watch out for code that returns a value from the catch block and
//modifies it in the finally block. If a catch block returns a primitive data
//type, the finally block can’t modify the value being returned by it. If a catch
//block returns an object, the finally block can modify the state of the object
//being returned by it.