package me.alexandroff.oca.simulator;

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        //System.out.println(b.h);
        //System.out.println(b.getH());
        System.out.println(b.h + " " + b.getH());
        System.out.println();
        System.out.println(b.getH() + " " + b.h);
        Beta bb = (Beta) b;
        //System.out.println(bb.h);
        //System.out.println(bb.h + " " + bb.getH());
    }
}
