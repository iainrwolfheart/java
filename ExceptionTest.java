class ExceptionTest{
	public static void main(String args[]){
		try{
			int a,b,c;
		//c="Bob";
		
			a=4;
			b=0;
			c=a/b;
			System.out.println("Result: "+c);
		}
		catch(ArithmeticException ref1){
			System.out.println("You're trying to divide by zero!");
		}
		catch(NumberFormatException ref2){
			System.out.println("You're trying to use a string as an int, numpty!");
		}
	}
}