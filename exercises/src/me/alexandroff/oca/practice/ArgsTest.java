package me.alexandroff.oca.practice;

//execute with java ArgsTest a b c
class FunWithArgs {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
        FunWithArgs fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);
    }
}

