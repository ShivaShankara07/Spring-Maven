package UpCastingAndDownCasting;

class A{
    public void show1(){
        System.out.println("A show1");
    }
}

class B extends A{
    public void show2(){
        System.out.println("B show1");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        obj.show1();
        obj2.show2();
        B obj3 = new B();   
        obj3.show2();
        B obj5 = (B) obj3;
        obj5.show1();
    }
}
