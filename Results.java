class Results{
	public static void main(String xyz[]){

		int phy, che, mat, total;
		float per;

	phy=65;
	che=70;
	mat=82;
	total=phy+che+mat;
	per=total*100/300;

	System.out.println("The total is "+total);
	System.out.println("Your percentage score is "+per+"%");

	if(per>=60){
		System.out.println("You have passed, congrats!");
	}

	else{
		System.out.println("You failed, fool.");
	}
	}
}