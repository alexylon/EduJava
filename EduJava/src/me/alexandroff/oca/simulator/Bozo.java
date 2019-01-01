package me.alexandroff.oca.simulator;

interface Bozo {
    int type = 0;
    // !!! Fields in interfaces are ALWAYS public, static and final


    public void jump();
}

class Type1Bozo implements Bozo {
    public Type1Bozo() {
        // type = 1;
        // !!! Fields in interfaces are ALWAYS public, static and final
        // thus it cannot be assigned a value to 'type'
        //BUT
        int type = 1;
        //this field is a NEW variable

    }

    public void jump() {
        System.out.println("jumping..." + type);
    }

    public static void main(String[] args) {

        Type1Bozo b = new Type1Bozo();
        b.jump();
        // jumping...0
    }
}
