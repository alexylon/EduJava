package me.alexandroff.oca.gupta.exception_handling;

// !!! If a catch block returns a PRIMITIVE data type,
//the finally block CAN'T modify the value being returned by it

public class MultipleReturn2 {
    int getInt() {
        int returnVal = 10;
        try {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        } catch (Exception e) {
            System.out.println("About to return :" + returnVal);
            return returnVal;
        } finally {
            returnVal += 10;
            System.out.println("Return value is now :" + returnVal);
        }
        return returnVal;
    }

    public static void main(String args[]) {
        MultipleReturn2 var = new MultipleReturn2();
        System.out.println("In Main:" + var.getInt());
    }
}

// Output:

//About to return :10
//Return value is now :20
//In Main:10

//Even though the finally block adds 10 to the variable returnVal, this modified value
//is not returned to the method main. Control in the catch block _copies_ the value of
//returnVal to be returned before it executes the finally block, so the returned value
//is NOT modified when finally executes.