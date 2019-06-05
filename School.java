class Results{
	
	private int phy, che, mat, total; float per;

	private void Calculations(){
		total=phy+che+mat;
		per=total*100/450;
	}

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
		else{
			Calculations();
			System.out.println("Total marks = "+total);
			System.out.println("Percentage = "+per+("%"));
		}
	}
}

class School{
	public static void main(String xyz[]){

	Results iain, olivia;
	iain = new Results();
	olivia = new Results();
	iain.Physics(45);
	iain.Chemistry(34);
	iain.Maths(24);
	System.out.println("The results for Iain are;");
	iain.ShowResults();
	olivia.Physics(40);
	olivia.Chemistry(80);
	olivia.Maths(134);
	System.out.println("The results for Olivia are;");
	olivia.ShowResults();
	}
}