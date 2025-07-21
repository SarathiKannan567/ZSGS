package com.Day1Assignment;

public class ExecutionOrderOfBlocks {
		static {
	        System.out.println("Static Block 1 executed.");
	    }

	    // Static variable initialization
	    static int staticVar = initializeStaticVar();

	    // Static block 2
	    static {
	        System.out.println("Static Block 2 executed.");
	    }

	    // Instance initializer block 1
	    {
	        System.out.println("Instance Initializer Block 1 executed.");
	    }

	    // Instance variable initialization
	    int instanceVar = initializeInstanceVar();

	    // Instance initializer block 2
	    {
	        System.out.println("Instance Initializer Block 2 executed.");
	    }

	    // Constructor
	    public ExecutionOrderOfBlocks() {
	        System.out.println("Constructor executed.");
	    }

	    // Helper method for static variable initialization
	    private static int initializeStaticVar() {
	        System.out.println("Static variable 'staticVar' initialized.");
	        return 10;
	    }

	    // Helper method for instance variable initialization
	    private int initializeInstanceVar() {
	        System.out.println("Instance variable 'instanceVar' initialized.");
	        return 20;
	    }
	    public static void main(String[] args) {
	        System.out.println("Main method started.");
	        ExecutionOrderOfBlocks obj1 = new ExecutionOrderOfBlocks();
	        System.out.println("Object 1 created.");
	        ExecutionOrderOfBlocks obj2 = new ExecutionOrderOfBlocks();
	        System.out.println("Object 2 created.");
	    }

}
