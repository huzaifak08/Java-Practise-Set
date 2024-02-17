class Base {
    Base() {
        System.out.println("This is constructor of Base Class");
    }

    Base(int x) {
        System.out.println("This is overloaded constructor of Base Class with x " + x);
    }
}

class Derived1 extends Base {
    Derived1() {
        System.out.println("This is constructor of Derived1 Class");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("This is overloaded constructor of Derived1 with value of x as " + x + " and y as: " + y);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Base b = new Base(10);
        // This is overloaded constructor of Base Class with x 10

        Derived1 d1 = new Derived1();
        // This is constructor of Derived1 Class

        Derived1 dd1 = new Derived1(2, 3);
        // This is overloaded constructor of Base Class with x 2
        // This is overloaded constructor of Derived1 with value of x as 2 and y as: 3

    }
}
