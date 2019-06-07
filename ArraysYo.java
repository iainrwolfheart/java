class ArraysYo{
	public static void main(String args[]){
		
		float first, second, result;
		first=second=result=0;

		try{
			first=Float.parseFloat(args[0]);
			second=Float.parseFloat(args[1]);
			result=first/second;
			System.out.println("Result: "+result);
		}
		catch(IndexOutOfBoundsException c1){
			System.out.println("Pass more values, silly.");
		}
		catch(ArithmeticException c2){
			System.out.println("Can't divide by zero, remember?");
		}
		catch(NumberFormatException c3){
			System.out.println("This string cannot be converted to digits, yo.");
		}

		/*int i;
		for(int i=0;i<args.length; i++){
			System.out.println(args[i]);
		}

		int[] FirstList={4,8,11,16,25};
		System.out.println(FirstList[3]);

		Array2 ref1=new Array2();
		ref1.Feed(2);
		Array3 ref2=new Array3();
		ref2.FeedFromVar();*/
	}
}
class Array2{
	public static void Feed(int num){
		int[] FirstList={4,8,11,16,25};
		System.out.println(FirstList[num]);
	}
}
class Array3{
	public static void FeedFromVar(){
		int A=3;
		int B=4;
		int[] FirstList={4,8,11,16,25};
		System.out.println((FirstList[A])+(FirstList[B]));
	}
}