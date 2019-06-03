class Results{
	
	private int phy, che, mat;

	public void Physics(int P){
		if(P>=0 && P<=150){
			phy=P;
		}
		else{
			phy=-1;
			System.out.println("Invalid entry!");
		}
	}

	public void Chemistry(int C){
		if(C>=0 && C<=150){
			che=C;
		}
		else{
			che=-1;
			System.out.println("Invalid entry!");
		}
	}

	public void Maths(int M){
		if(M>=0 && M<=150){
			mat=M;
		}
		else{
			mat=-1;
			System.out.println("Invalid entry!");
		}
	}

	public void ShowResults(){

		int total;
		total=phy+che+mat;

		if(phy==-1||che==-1||mat==-1){
			System.out.println("No results!");
		}
		if(total<300){
			System.out.println("Fail");
		}
		else{
			System.out.println("Pass");
		}
	}
}

class School{
	public static void main(String xyz[]){

		Results Peter, James;
		Peter=new Results();
		James=new Results();

		Peter.Physics(92);
		Peter.Chemistry();
		Peter.Maths(82);

		James.Physics();
		James.Chemistry(95);
		James.Maths(83);

		Peter.ShowResults();
		James.ShowResults();
	}
}