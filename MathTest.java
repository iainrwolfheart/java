class Maths{
	public void Addition(int a, int b){
		int Result;
		Result=a+b;
		System.out.println("The addition result is "+Result);
	}
	public int Subtraction(int a, int b){
		int Answer;
		Answer=a-b;
		return Answer;
	}
}

class MathTest{
	public static void main(String xyz[]){
		Maths x;
		x=new Maths();
		
		x.Addition(5,2);

		System.out.println("The subtraction result is "
			+ x.Subtraction(10,3));
			}
}