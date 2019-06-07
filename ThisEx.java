class ThisEx{
	public static void main(String args[]){
		Math47 ref=new Math47();
		Math47 ref2=new Math47();
		Math48 ref3=new Math48();

		//ref.Message();
		//ref2.Message2();
		ref3.Message();
		ref3.Message3();
	}
}
class Math47{
	private int a;

	protected void Message(){
		int a;
		this.a=20;
		a=15;
		System.out.println("The result is "+a);
	}
	public void Message2(){
		System.out.println("The result is "+a);
	}
}

class Math48 extends Math47{

	public void Message3(){
		System.out.println("The result is "+a);
	}
}