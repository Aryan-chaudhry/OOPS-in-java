package OOPS;

public class constructorOverloading {
    constructorOverloading(){

    }

    constructorOverloading(String Name){
        System.out.println("Hi my name is " + Name);
    }

    constructorOverloading(String city, int postalCode){
        System.out.println("Hi my city is " + city + " and its postal code is " + postalCode);
    }

    constructorOverloading(String Name, int age, String country){
        System.out.println("Hey i am " + Name + ", my age is " + age + " and i am citizen of " + country);
    }

    public static void main(String[] args) {
        constructorOverloading dc = new constructorOverloading();
        constructorOverloading pc1 = new constructorOverloading("Aryan");
        constructorOverloading pc2 = new constructorOverloading("Karnal", 132001);
        constructorOverloading pc3 = new constructorOverloading("Aryan", 21, "India");
    }
}
