package OOPS;

import java.lang.reflect.Constructor;

public class constructor {
    // default constructor
    constructor(){
        System.out.println("Hi i am Default constructor!");
    }

    // parametrised constructor
    constructor(String Name, int age){
        System.out.println("hi i am " +  Name + " and my age is : " + age);
    }

    public static void main(String[] args) {
        constructor dc = new constructor();
        constructor pc = new constructor("Aryan", 20);
    }
}
