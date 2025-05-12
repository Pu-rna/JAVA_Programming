// Bird Class Hierarchy6.3

abstract class Bird {
    String name;
    String colour;

    Bird(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    abstract void Fly();
}

class FlyingBird extends Bird {
    FlyingBird(String name, String colour) {
        super(name, colour);
    }

    @Override
    void Fly() {
        System.out.println(name + " is flying.");
    }
}

class NonFlyingBird extends Bird {
    NonFlyingBird(String name, String colour) {
        super(name, colour);
    }

    @Override
    void Fly() {
        System.out.println(name + " cannot fly.");
    }
}

public class Birdfn {
    public static void main(String[] args) {
        FlyingBird eagle = new FlyingBird("Eagle", "Brown");
        NonFlyingBird ostrich = new NonFlyingBird("Ostrich", "Black");

        eagle.Fly();
        ostrich.Fly();
    }
}
