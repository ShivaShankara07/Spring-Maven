package AbstractEp;

abstract class Animal {
    abstract void food();

    public void language() {
        System.out.println("Can't talk");
    }
}

class Rabbit extends Animal {
    void food() {
        System.out.println("Carrot");
    }

}

class Frog extends Animal {
    void food() {
        System.out.println("Insects");
    }
}

public class Episode61 {
    public static void main(String[] args) {
        Rabbit obj = new Rabbit();
        obj.food();
        obj.language();
        Frog obj1 = new Frog();
        obj1.food();
        obj1.language();
    }
}

/** Notes:
    Abstarct method should be in Abstarct class
    we can have normal methods in Abstarct class
    we cant create objects of abstarct class
    we must and should implement the abstract methods in child class unless the child class is also abstarct class
    if we dont want to create abstract method from the abstract parent class then we have to make the child class abstarct (point to be noted now we cant create an object of child class because it is abstarct class now)
**/