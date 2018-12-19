package me.alexandroff.oca;

class Base {
    String base = "Base";

    void methodA() {
        System.out.println("Base - methodA");
    }

    void methodC() {
        System.out.println("Base - methodC");
    }
}

class Sub extends Base {
    String sub = "Sub";

    void methodA() {
        System.out.println("Sub - methodA");
    }

    void methodB() {
        System.out.println("Sub - methodB");
    }
}

class InheritanceTest {
    public static void main(String[] args) {
        Base b = new Sub();
        Sub s = new Sub();

        b.methodA(); // Sub - methodA
        //b.methodB();
        // DOES NOT COMPILE because there is no methodB in 'Base'
        // 'Parent' does NOT see 'child'
        s.methodC(); // Base - methodC
        // Compiles because methodC is inherited
        // 'Child' SEES 'parent'

        System.out.println(b.base);
        //System.out.println(b.sub);
        // DOES NOT COMPILE because there is no variable 'sub' in 'Base'
        System.out.println(s.base);
        // Compiles because 'base' is inherited

    }
}
