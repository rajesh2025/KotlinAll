package polymorphism;

// Superclass
class Base { 
	
	// Static method in base class which will be hidden in subclass 
	public static void display() { 
		System.out.println("Static or class method from polymorphism.Base");
	} 
	
	// Non-static method which will be overridden in derived class 
	public void print() { 
		System.out.println("Non-static or Instance method from polymorphism.Base");
	} 
} 

// Subclass 
class Derived extends Base { 
	
	// This method hides display() in polymorphism.Base
	public static void display() { 
		System.out.println("Static or class method from polymorphism.Derived");
	} 
	
	// This method overrides print() in polymorphism.Base
	public void print() { 
		System.out.println("Non-static or Instance method from polymorphism.Derived");
} 
} 

// Driver class 
public class Test { 
	public static void main(String... args) {
	Base obj1 = new Derived(); 
		
	// As per overriding rules this should call to class Derive's static 
	// overridden method. Since static method can not be overridden, it 
	// calls polymorphism.Base's display()
	obj1.display(); 
		
	// Here overriding works and Derive's print() is called 
	obj1.print();	 
	} 
} 
