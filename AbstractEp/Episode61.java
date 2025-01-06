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
