package me.alexandroff.oca.gupta.exception_handling;

class FallInRiverException extends Exception {
}

class DropOarException extends Exception {
}

public class RiverRafting {

    void crossRapid(int degree) throws FallInRiverException {
        System.out.println("Cross Rapid");
        if (degree > 10) throw new FallInRiverException();
    }

    void rowRaft(String state) throws DropOarException {
        System.out.println("Row Raft");
        if (state.equals("nervous")) throw new DropOarException();
    }
}

class TestRiverRafting {

    public static void main(String args[]) {
        RiverRafting riverRafting = new RiverRafting();
        try {
            riverRafting.crossRapid(11);
            // If exception found stops here and skips to "catch-s"
            riverRafting.rowRaft("happy");
            System.out.println("Enjoy River Rafting");
        } catch (FallInRiverException e1) {
            System.out.println("Get back in the raft");
        } catch (DropOarException e2) {
            System.out.println("Do not panic");
        } finally {
            System.out.println("Pay for the sport");
        }
        System.out.println("After the try block");
    }
}