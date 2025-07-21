package com.Day1Assignment;

class Animal {
    // Base class
}

class Dog extends Animal {
    // Subclass of Animal
}

class Cat extends Animal {
    // Subclass of Animal
}
public class InstanceOfClassOrNot {
	public static void main(String[] args) {
		    Animal myDog = new Dog();
	        Animal myCat = new Cat();
	        String myString = "Hello";
	        Object nullObject = null;

	        if (myDog instanceof Dog) {
	            System.out.println("myDog is an instance of Dog.");
	        } else {
	            System.out.println("myDog is not an instance of Dog.");
	        }

	        if (myDog instanceof Animal) {
	            System.out.println("myDog is an instance of Animal.");
	        } else {
	            System.out.println("myDog is not an instance of Animal.");
	        }

	        if (myCat instanceof Dog) {
	            System.out.println("myCat is an instance of Dog.");
	        } else {
	            System.out.println("myCat is not an instance of Dog.");
	        }

	        if (myString instanceof String) {
	            System.out.println("myString is an instance of String.");
	        } else {
	            System.out.println("myString is not an instance of String.");
	        }

	        if (nullObject instanceof Object) {
	            System.out.println("nullObject is an instance of Object.");
	        } else {
	            System.out.println("nullObject is not an instance of Object.");
	        }

	}

}
