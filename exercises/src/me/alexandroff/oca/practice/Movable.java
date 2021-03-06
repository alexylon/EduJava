package me.alexandroff.oca.practice;

public interface Movable {
    int location = 0;

    void move(int by);

    public void moveBack(int by);
}

class Donkey implements Movable {
    int location = 200;
    //'location' from the interface can be hidden
    /*
    location = 200;
    */
    //BUT 'location' from the interface CANNOT be assighed again
    //as it is always 'public', 'static' and 'final'

    public void move(int by) {
        location = location + by;
    }

    public void moveBack(int by) {
        location = location - by;
    }
}

class TestClassDonkey {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);

        double db = 43e1;
        System.out.println(db);
    }
}
