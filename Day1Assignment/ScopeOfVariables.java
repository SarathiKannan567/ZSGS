package com.Day1Assignment;

class Variable {
	static int staticVariable=10;      //static variable
}

public class ScopeOfVariables {
    int instanceVariable;
    public ScopeOfVariables(){
        this.instanceVariable =100;      //instance variable
    }
    
	public static void main(String[] args) {
		int localVariable=5;            //local variable
		for(int i=0;i<localVariable;i++) {
			int count=i;                //block variable
			System.out.println(count);
		}
		System.out.println(Variable.staticVariable);
		ScopeOfVariables scope=new ScopeOfVariables();
		System.out.println(scope.instanceVariable);
	}
}
