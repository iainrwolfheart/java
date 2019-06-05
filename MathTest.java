class MathTest{
	public static void main(String args[]){
		Maths call=new Maths();
		//call.Add(23,14);
		call.Subtract(23,14);
		//call.Mult(23,14);
	}
}

class Maths{
	//public void Add(int a, int b);
	public void Subtract(int a, int b){
		System.out.println("The sub result is "+(a-b));
	}
}

class Maths2 extends Maths{
	public void Mult(int a, int b){
		int result=a*b;
		System.out.println("The mult result is "+result);
	}
	public void Add(int a, int b){
		int result=a+b;
		System.out.println("The add result is "+result);
	}
}

