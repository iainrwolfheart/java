class AccountsTest{
	public static void main(String xyz[]){
		Bank hsbc, natwest, nbs;
		hsbc=new Bank();
		natwest=new Bank();
		nbs=new Bank();
		hsbc.Amount(4);
		Bank.Setdollar(200);
		natwest.Amount(8);
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