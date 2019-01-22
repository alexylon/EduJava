package me.alexandroff.oca.practice;

public class ExceptionClassCast1 {
    public static void main(String[] args) {
        Building building = new Building();
        Room room = new Room();
        /*
        room = building; //DOES NOT COMPILE
        */
        room = (Room) building;
        //ClassCastException -
        // the object of building is of type Building
        // and CANNOT be cast to object of type Room
    }
}

class Building {
}

class Room extends Building {
}