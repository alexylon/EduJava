package me.alexandroff.oca.simulator;

class Marsupial {
    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial: " + isBiped());
    }
}

class Kangaroo extends Marsupial {
    public boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo kangKang = new Kangaroo();
        Marsupial marsKang = new Kangaroo();
        Marsupial marsMars = new Marsupial();
        kangKang.getMarsupialDescription();
        kangKang.getKangarooDescription();
        marsKang.getMarsupialDescription();
        marsMars.getMarsupialDescription();
        //marsKang.getKangarooDescription(); DOES NOT COMPILE
        //marsMars.getKangarooDescription(); DOES NOT COMPILE
    }
}
