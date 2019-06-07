class AccountsTest{
	public static void main(String xyz[]){
		Bank hsbc, natwest, nbs;
		hsbc=new Bank();
		natwest=new Bank();
		nbs=new Bank();
		hsbc.Setdollar(100);
		hsbc.Amount(4);
		natwest.Setdollar(200);
		natwest.Amount(8);
		nbs.Setdollar(400);
		nbs.Amount(7);
	}
}

class Bank{
	static int dollar;
	public void Setdollar(int a){
		dollar=a;
	}
	public void Amount(int b){
		System.out.println("Amount is "+(b*dollar));
	}
}