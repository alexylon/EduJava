package me.alexandroff.oca.gupta.stringbuilder_methods;

public class StringBuilder_Methods_Test {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder();
        name.append("Alexander");
        name.append(72);
        System.out.println(name);
        //Alexander72

        name.insert(9, "_");
        System.out.println(name);
        //Alexander_72

        name.delete(10, 13);
        System.out.println(name);
        //Alexander_

        name.deleteCharAt(9);
        System.out.println(name);
        //Alexander

        name.insert(9, "O");
        System.out.println(name);
        //AlexanderO

        name.insert(9, "sashKin", 4, 5);
        System.out.println(name);
        //AlexanderKO

        name.replace(7, 11, "rov");
        System.out.println(name);
        //Alexandrov

        name.substring(4);
        System.out.println(name);
        //Alexandrov
        // !!!"substring" and "subSequence" don't change StringBuilder
        String name2 = name.substring(4);
        // !!!The variable is of type "String"
        String name3 = name.substring(1, 6);
        CharSequence name4 = name.subSequence(1, 6);
        // !!!The variable is of type "CharSequence"
        System.out.println(name2);
        //androv
        System.out.println(name3);
        //lexan
        System.out.println(name4);
        //lexan
        System.out.println(name.reverse());
        //vordnaxelA
    }
}
