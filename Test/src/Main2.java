
class overriding{
	
	 void meth(int a , int b) {
		System.out.println("a+b");

	}
	
	
}


class A  extends overriding{
	
	@Override
	void meth(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println(a-b);
	}
}



public class Main2 {

	public static void main(String[] args) {
		A n = new A();
		n.meth(10, 20);
		
	}
}
