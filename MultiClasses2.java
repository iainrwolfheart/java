class Second{
	int phy, che;

	public void message(){
		System.out.println("Hello");
		System.out.println("my friends.");
	}
}

class MultiClasses2{
	
	public static void main(String xyz[]){
		
		Second hi;
		hi=new Second();

	hi.phy=75;
	hi.che=82;

	hi.message();
	System.out.println(hi.phy+hi.che);
	}
}