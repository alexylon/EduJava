package me.alexandroff.oca.practice;

class A4 {
    static {
        System.out.println(" In A's static initializer");
    }

    A4() {
        System.out.println(" In A's constructor");
    }

    {
        System.out.println(" In A's instance initializer");
    }
}

class B4 extends A4 {
    static {
        System.out.println(" In B's static initializer");
    }

    {
        System.out.println(" In B's instance initializer");
    }

    B4() {
        System.out.println(" In B's constructor");
    }

    public static void main(String[] args) {
        System.out.println(" In B.main()");
        B4 b = new B4();
        B4 b1 = new B4(); // creating B's object again
    }
}

// Order of initialization summarized

//1. If there is a super class, initialize static fields and
// execute static initializers of the super class in the order
// of their appearance (performed only once per class)

//2. Initialize static fields and execute static initializers of the class
// in the order of their appearance (performed only once per class)

//3. If there is a super class, initialize the instance fields
// and execute instance initializers of the super class in
// the order of their appearance

//4. Execute super class's constructor

//5. Initialize the instance fields and execute instance initializers
// of the class in the order of their appearance

//6. Execute class's constructor
