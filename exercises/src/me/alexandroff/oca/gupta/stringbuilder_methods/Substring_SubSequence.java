package me.alexandroff.oca.gupta.stringbuilder_methods;

// Method 'substring' is the same as String.
//'substring' and 'subSequence' DON'T modify the object

public class Substring_SubSequence {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("01234567");
        CharSequence subSeq1 = sb1.subSequence(2, 4);
        // Doesn't modify sb1 !!!
        System.out.println(subSeq1);
        System.out.println(sb1);
        String subStr1 = sb1.substring(2, 4);
        // Doesn't modify sb1 !!!
        String subStr2 = sb1.substring(2);
        System.out.println(subStr1);
        System.out.println(sb1);
    }
}
