package OOPS;

class Animal{
     class Bird{
        void show(){
            System.out.println("Hi i am Eagle");
        }
    }
}

class Rich{
    class med{
        class poor{
            void status(){
                System.out.println("Hi i am poor!");
            }
        }
    }
}

public class InnerClass {
   public static void main(String[] args) {
    Animal.Bird Eg = new Animal().new Bird();
    Eg.show();

    Rich.med.poor p = new Rich(). new med(). new poor();
    p.status();
   }
}
