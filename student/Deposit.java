package student;

public class Deposit extends Transaction{
	Deposit(double a){
  	  bal=bal+a;
  	execute(bal);
    }
	void execute(double bal) {
		Balance b=new Balance();
		b.execute(bal);
    }
}
