class A{
	public static void m1() {
		System.out.println("Parent");
	}
}

class B extends A{
	public static void m1() {
		System.out.println("Child");
	}
}


public class StaticMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aRef =new B();
		A.m1(); //Parent
		aRef.m1(); //Parent

	}

}
