class ConstructorEx{
	public static void main(String args[]){

		Three ref=new Three(7);
	}
}

class One{
	public One(){
		System.out.println("One with no v.");
	}
	public One(int a){
		System.out.println("One with one v.");
	}
}
class Two extends One{
	public Two(){
		this(7);
		System.out.println("Two with no v.");
	}
	public Two(int a){
		System.out.println("Two with one v.");
	}
}
class Three extends Two{
	public Three(){
		System.out.println("Three with no v.");
	}
	public Three(int a){
		System.out.println("Three with one v.");
	}
}