package student;

public class Transaction extends Student{
	String acc_no;
	double bal=0;
	Transaction(){
		System.out.println("Transaction Selection");
		String acc =s.next();
		acc_no=acc;
		execute();
		
	}
	void getAccno(){
		System.out.println(acc_no);
	}
	void execute() {
		
	System.out.println("1 Balance Inquiry");
		System.out.println("2 Withdraw");
		System.out.println("3 deposit");
		int n =s.nextInt();
		if(n==1) {
			Balance b=new Balance();
			b.execute(bal);
		}
		else if(n==2) {
			System.out.println("Enter amount to be withdrawn");
			double wit=s.nextDouble();
			Withdrawn w=new Withdrawn(wit);
		}
		else {
			System.out.println("Enter amount to be deposited");
			double wit=s.nextDouble();
			Deposit w=new Deposit(wit);
		}
		
		
	}

}
