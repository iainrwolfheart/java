class Painting{
	public static void main(String args []){
		Line ref=new Line();
		LetsDraw(ref);
		Circle ref2=new Circle();
		LetsDraw(ref2);
		Square ref3=new Square();
		LetsDraw(ref3);
	}
	public static void LetsDraw(Draw D){
		D.Drawing();
		D.Paint();
	}
}

abstract class Draw{
	abstract public void Drawing();
	public void Paint(){
		int a;
	}
}

class Line extends Draw{
	public void Drawing(){
		System.out.println("I'm drawing a line.");
	}
	//public void Paint(){
	//	int b;
	//}
}

class Circle extends Draw{
	public void Drawing(){
		System.out.println("I'm drawing a circle.");
	}
	//public void Paint(){
	//	int b;
	//}
}
class Square extends Draw{
	public void Paint(){
		System.out.println("And now I'm actually painting!");
	}
	public void Drawing(){
		int a;
	}
}