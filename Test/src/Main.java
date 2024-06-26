
class overloading{
	
	void meth() {
		System.out.println("ajay");

	}
	
	
	void meth(int a) {
		System.out.println(a);

	}	
	
	
}



public class Main {

	public static void main(String[] args) {
		overloading n = new overloading();

		n.meth();
		n.meth(20);
	}

}
