class NBS{
	public static void main(String xyz[]){

		Bank ref;
		ref=new Bank();
		ref.Deposit(200);
		ref.Withdraw(100);
		ref.Balance();
	}
}

class Bank{
	String pound = "\u00a3";
	private int amount;

	public void Deposit (int money){
		amount+=money;
	}
	public void Withdraw (int money){
		if(money<=amount){
			amount-=money;
		}
		else{
			System.out.println("Insufficient funds.");
		}
	}
	public void Balance(){
		System.out.println("Your balance is "+pound+amount);
	}
	public Bank(){
		System.out.println("Welcome to your account.");
	}
}