package OOPS.Inheritance;

class Animal{
    void info(){
        System.out.println("Hi i am Animal Class");
    }
}

class Dog extends Animal{
    void info(){
        System.out.println("Hi i a germen shefered Dog");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        Dog sheru = new Dog();
        sheru.info();
    }
}
