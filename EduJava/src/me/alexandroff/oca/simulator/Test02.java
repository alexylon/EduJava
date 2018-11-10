package me.alexandroff.oca.simulator;

class Super {  }
class Sub extends Super {  }
class TestClass2{
    public static void main(String[] args){
        Super s1 = new Super(); //1
        Sub s2 = new Sub();     //2
        s1 = (Super) s2;        //3
    }
}
