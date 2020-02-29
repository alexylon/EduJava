package me.alexandroff.oca.gupta.flow_control;

public class Break_Continue {

    public static void main(String[] args) {

        String[] family = new String[]{"Alexander", "Ekaterina",
                "Anastasia", "Konstantin"};

        System.out.println("The parents are:");
        for (String member : family) {
            if (member.equals("Anastasia")) break;
            System.out.println(member);
        }

        System.out.println();

        System.out.println("The males are:");
        for (String member : family) {
            if (member.equals("Ekaterina") ||
                    member.equals("Anastasia")) continue;
            System.out.println(member);
        }

        System.out.println();

        System.out.println("The females are:");
        for (int i = 0; i < family.length; i++) {
            if (family[i].equals("Alexander") ||
                    family[i].equals("Konstantin")) continue;
            System.out.println(family[i]);
        }
    }
}
